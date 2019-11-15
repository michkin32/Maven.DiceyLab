public class Simulation {

public Integer numberOfDies;
public Integer numberOfTosses;
Bins tallyBin = new Bins();

public Simulation(Integer numberOfDies, Integer numberOfTosses) {
    this.numberOfDies = numberOfDies;
    this.numberOfTosses = numberOfTosses;
}
public Bins runSimulation() {

    Dice dice = new Dice();
    for(int i = 0; i < numberOfTosses; i++){
        tallyBin.incrementBin(dice.rollDice(numberOfDies));

    }
    return tallyBin;
}

public String toString(Bins bin){
    Double total = totalRolls(bin);
    String finalResult = "***\n" +
            "Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.\n" +
            "***"+"\n"
            +"\n";
    for(int i = 2; i < bin.bins.length; i++){
            Integer dieroll = bin.bins[i];
            Double average = bin.bins[i]/total;
            if (i <= 9 && dieroll < 100000){
            finalResult +=" " + " " + i + ":   " + dieroll + ": " + dieroll/total + numberOfstars(average,total) + "\n";
            }else if (i <= 9 && dieroll > 100000){
                finalResult += " " +  " " + i + ":  " + dieroll + ": " + dieroll/total + numberOfstars(average,total) + "\n";
            }else if(i >= 9 && dieroll < 100000){
                finalResult += " " + i + ":   " + dieroll + ": " + dieroll/total + numberOfstars(average,total) + "\n";
            }
    }

    return finalResult;
}
public Double totalRolls(Bins bin){
    Double sum = 0.0;
    for(int i = 2; i < bin.bins.length; i++){
        sum += bin.bins[i];
    }
    return sum;
}
public String numberOfstars(Double average, Double total){
    StringBuilder sb = new StringBuilder();
    Integer n = (int) (average * 100);

    for (int i = 0; i < n; i++){
        sb.append("*");
    }
    return sb.toString();
}

}
