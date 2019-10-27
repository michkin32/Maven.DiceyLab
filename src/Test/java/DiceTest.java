import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void rollDieTest() {

        Integer expected = Dice.rollOneDie();

        Integer actual = Dice.rollOneDie();

        assertNotEquals(expected, actual);



    }

    @Test
    public void rollDice() {
        Dice dice = new Dice();
        Integer expected = dice.rollDice(2);

        Integer actual = dice.rollDice(2);

        assertNotEquals(expected, actual);
    }
}