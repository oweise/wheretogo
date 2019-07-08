package de.consol.dus.cedric.wheretogo;

import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.*;

public class PlaceTest {

    @Test
    public void placeShouldStoreNextPlaces() throws IOException {
        Place place = new Place("test");
        Place place1 = new Place("test2");
        place.setNextPlace(Direction.NORTH, place1);
        assertNotNull(place.getNextPlace(Direction.NORTH));
        // TODO: Check place storage for all directions using assertSame
    }

    @Test
    public void placeShouldReturnNullUponUnsetPlace() throws IOException {
        Place place = new Place("sgsfdg");
        assertNull(place.getNextPlace(Direction.NORTH));
    }

}