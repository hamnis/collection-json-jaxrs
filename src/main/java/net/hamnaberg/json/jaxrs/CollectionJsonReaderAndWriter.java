package net.hamnaberg.json.jaxrs;

import net.hamnaberg.json.Collection;
import net.hamnaberg.json.Template;
import net.hamnaberg.json.Writable;
import net.hamnaberg.json.parser.CollectionParser;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
@Produces(Constants.MEDIA_TYPE_STRING)
public final class CollectionJsonReaderAndWriter implements MessageBodyReader<Template>, MessageBodyWriter<Writable> {
    private final CollectionParser parser = new CollectionParser();

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        boolean compatible = mediaType.isCompatible(Constants.MEDIA_TYPE);
        return compatible && (Template.class.equals(type));
    }

    @Override
    public Template readFrom(Class<Template> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
        return parser.parseTemplate(entityStream);
    }

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        boolean compatible = mediaType.isCompatible(Constants.MEDIA_TYPE);
        return compatible && (Template.class.equals(type) || Collection.class.equals(type));
    }

    @Override
    public long getSize(Writable writable, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Writable writable, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        writable.writeTo(entityStream);
    }
}
