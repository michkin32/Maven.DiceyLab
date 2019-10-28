public class Simulation {

public Integer numberOfDies;
public Integer numberOfTosses;
Bins tallyBin = new Bins();

public Simulation(Integer numberOfDies, Integer numberOfTosses) {
    this.numberOfDies = numberOfDies;
    this.numberOfTosses = numberOfTosses;
}
public Integer runSimulation() {

    Dice dice = new Dice();
    for(int i = 0; i < numberOfTosses; i++){
        tallyBin.incrementBin(dice.rollDice(numberOfDies));

    }
    return tallyBin.returnBinTally(2);
}
}
