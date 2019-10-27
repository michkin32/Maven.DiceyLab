import java.util.Random;

public class Dice {

    public Integer rollDice(){
        Integer diceRoll1 = rollOneDie();
        Integer diceRoll2 = rollOneDie();

        Integer toss = diceRoll1 + diceRoll2;

        return toss;
    }

    private Integer rollOneDie() {
        Integer sides = 6;
        Random randomNumber = new Random();

        return randomNumber.nextInt(sides) + 1;
    }


}
