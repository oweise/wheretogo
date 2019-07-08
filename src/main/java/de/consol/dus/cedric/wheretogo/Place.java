package de.consol.dus.cedric.wheretogo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Place {

    private final String name;

    private Map<Direction,Place> nextPlaces = new HashMap<>();

    public Place(String name) throws IOException {
        this.name = name;
    }

    public String getDescription() throws IOException, URISyntaxException {
        String descriptionFilePath = String.format("descriptions/places/%s.txt", name);
        URL descriptionFileURL = ClassLoader.getSystemClassLoader().getResource(descriptionFilePath);
        if (descriptionFileURL == null) {
            throw new IllegalStateException("Cannot find resource: " + descriptionFilePath);
        }
        return new String(Files.readAllBytes(Paths.get(descriptionFileURL.toURI())), "UTF-8");
    }

    public Place getNextPlace(Direction direction) {
        return this.nextPlaces.get(direction);
    }

    public void setNextPlace(Direction direction, Place place) {
        this.nextPlaces.put(direction, place);
    }

}
