package net.hamnaberg.json.jaxrs;

import javax.ws.rs.core.MediaType;

public final class Constants {
    private Constants() {
    }

    public static final String MEDIA_TYPE_STRING = "application/vnd.collection+json";
    public static final MediaType MEDIA_TYPE = MediaType.valueOf(MEDIA_TYPE_STRING);
}
