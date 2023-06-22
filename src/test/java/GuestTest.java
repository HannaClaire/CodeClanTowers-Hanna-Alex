import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Alex", 90);
    }

    @Test
    public void canGetName(){
        assertEquals("Alex", guest.getName());
    }

    @Test
    public void canGetAge(){
        assertEquals(90, guest.getAge());
    }
}
