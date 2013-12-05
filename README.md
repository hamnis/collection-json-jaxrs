# Minimal library for getting Collection+json + Java working with jaxrs.

# Maven coordinates

Releases are pushed to oss.sonatype.org which again syncs with maven central.


    <dependency>
        <groupId>net.hamnaberg.json</groupId>
        <artifactId>collection-json-jaxrs</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>

You will also need an implementation of collection+json.
This library supports both 2.5 and 3.x.

    <dependency>
        <groupId>net.hamnaberg.rest</groupId>
        <artifactId>json-collection</artifactId>
        <version>3.0.0</version>
    </dependency>


    <dependency>
        <groupId>net.hamnaberg.rest</groupId>
        <artifactId>json-collection</artifactId>
        <version>2.5</version>
    </dependency>


