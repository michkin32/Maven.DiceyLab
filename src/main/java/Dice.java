import java.util.Random;

public class Dice {

    public Integer rollDice(Integer numberOfDice){
        Integer toss = 0;
        for (int i = 0; i < numberOfDice; i++) {
            toss += Dice.rollOneDie();
        }



        return toss;
    }

    public static Integer rollOneDie() {
        Integer sides = 6;
        Random randomNumber = new Random();

        return randomNumber.nextInt(sides) + 1;
    }


}
