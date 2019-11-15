import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void runSimulation() {
        Simulation sim1 = new Simulation(2, 100);

        Bins actual;


        /*for (int i = 0; i < 100; i++) {
            actual = sim1.runSimulation();

            Integer minExpected = 2;
            assertTrue(minExpected <= actual);


            actual = sim1.runSimulation();
            Integer maxExpected = 0;
            assertTrue(maxExpected >= actual);
        }*/

    }
    @Test
    public void runSimulationTest2() {
        Simulation sim1 = new Simulation(2, 100);



    }

    @Test
    public void testToString() {
        Simulation sim1 = new Simulation(2, 1000000);
        Bins results = sim1.runSimulation();
        System.out.print(sim1.toString(results));

    }

    @Test
    public void totalRolls() {
    }

    @Test
    public void numberOfstars() {
    }
}