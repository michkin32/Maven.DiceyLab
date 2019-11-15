import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void runSimulation() {
        Simulation sim1 = new Simulation(2, 100);

        Bins bin1 = new Bins();
        Bins bin2 = sim1.runSimulation();


        Assert.assertNotEquals(bin1.bins[2],bin2.bins[2]);

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
        Simulation sim2 = new Simulation(2, 1000000);
        Bins results2 = sim1.runSimulation();
        sim2.printResults();

    }

    @Test
    public void totalRolls() {
        Simulation sim1 = new Simulation(2, 1000000);
        Bins results = sim1.runSimulation();

        Double actual = sim1.totalRolls(results);
        Double expected = 0D;

        for(int i = 2; i < results.bins.length; i++){
            expected += results.bins[i];
        }
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void numberOfstars() {
        Simulation sim1 = new Simulation(2, 1000000);
        Bins results = sim1.runSimulation();

        String actual = sim1.numberOfstars(.09);
        String expected = "*********";
    }
}