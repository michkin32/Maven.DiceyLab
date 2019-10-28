import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void runSimulation() {
        Simulation sim1 = new Simulation(2,10);
        Integer expected = sim1.runSimulation();

        assertNotEquals(expected, sim1.tallyBin.bins[0]);
    }
}