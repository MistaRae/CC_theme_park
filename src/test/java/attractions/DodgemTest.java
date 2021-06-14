package attractions;

import ThemePark.attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        child = new Visitor(10, 1.00,40);
        adult = new Visitor(40, 1.80,40);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void chargesHalfPrice(){
        dodgems.sellTicket(child);
        assertEquals(37.75, child.getMoney(),0.00);
    }

    @Test
    public void chargesFullPrice(){
        dodgems.sellTicket(adult);
        assertEquals(35.50, adult.getMoney(), 0.00);
    }

}
