import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void incrementBin() {
        //Given
        Bins bin = new Bins();
        Integer expected = 1;
        //when
        bin.incrementBin(4);

        //then
        Integer actual = bin.returnTally(4);
        assertEquals(expected,actual);

    }

    @Test
    public void returnTally() {
        //Given
        Bins bin = new Bins();
        Integer expected = 2;

        //when
        bin.incrementBin(4);
        bin.incrementBin(4);

        //then
        Integer actual = bin.returnTally(4);
        assertEquals(expected,actual);


    }
}