package net.hamnaberg.json.jaxrs;

import javax.ws.rs.core.MediaType;

public final class Constants {
    private Constants() {
    }

    public static final MediaType MEDIA_TYPE = MediaType.valueOf("application/vnd.collection+json");
}
