import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;


    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }
    @Test
    public void canGetMaxCapacity(){
//        bedroom.getMaxCapacity();
        assertEquals(1, bedroom.getMaxCapacity());
    }



}
