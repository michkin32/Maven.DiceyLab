import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void rollDiceTest() {
        Dice dice = new Dice();
        Integer expected = dice.rollDice();
        Integer actual = dice.rollDice();
        assertNotEquals(expected, actual);
    }

}