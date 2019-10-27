

public class Bins {
public Integer[] bins = new Integer[13];

public Bins() {
    for (int i = 0; i < bins.length; i++) {
        bins[i] = 0;
    }
}

public void incrementBin(Integer diceRollResult){
    bins[diceRollResult] += 1;
}
public Integer returnTally(Integer valueOfIndex){

    return bins[valueOfIndex];
}

}
