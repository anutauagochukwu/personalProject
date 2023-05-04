package edu.bu.met.cs665.tapeMachineSoftware;

/*import static org.junit.Assert.assertEquals;*/
import org.junit.Test;

public class TapeMachineTest {

    @Test
    public void testRunUnwindMachine() {

        AdhesiveTape tape1 = new FskTape(78, "ad198");
        GeometricTapeMachine machine = new GeometricTapeMachine(tape1);
        machine.runRewindMachine(350, 250);

    }

    @Test
    public void testRunCoatingHead() {

        AdhesiveTape tape2 = new AluminumTape(81, "ad126");
        GeometricTapeMachine machine = new GeometricTapeMachine(tape2);
        machine.runCoatingHead(3.5);


    }

    @Test
    public void testRunOvenHeat() {

        AdhesiveTape tape3 = new FoilTape(49, "ad131");
        GeometricTapeMachine machine = new GeometricTapeMachine(tape3);
        machine.runOvenHeat(6000);

    }

    @Test
    public void testMeasureAdhesive() {

        AdhesiveTape tape4 = new BoppTape(78, "ad198");
        GeometricTapeMachine machine = new GeometricTapeMachine(tape4);
        machine.runCoatingHead(2.7);
        machine.measureAdhesive();

    }

    @Test
    public void testRunLaminationMachine() {

        AdhesiveTape tape5 = new AluminumTape(72, "ad149");
        GeometricTapeMachine machine = new GeometricTapeMachine(tape5);
        machine.runLaminationMachine(75);
    }

    @Test
    public void testRunRewindMachine() {

        AdhesiveTape tape6 = new FskTape(72, "ad198");
        GeometricTapeMachine machine = new GeometricTapeMachine(tape6);
        machine.runRewindMachine(350, 230);

    }

    @Test
    public void testRunSecondaryUnwind() {

        AdhesiveTape tape7 = new FskTape(72, "ad198");
        GeometricTapeMachine machine = new GeometricTapeMachine(tape7);
        machine.runRewindMachine(350, 230);

    }

    @Test
    public void testSetStrategy() {

        AdhesiveTape Tape8 = new BoppTape(81, "ad139");
        GeometricTapeMachine machine = new GeometricTapeMachine();
        ChangeSurfaceEnergyStrategy myStrategy = new ChangeEnergyWithElectric(Tape8);

        machine.setStrategy(myStrategy);

    }

    @Test
    public void testRunChangeSurfaceEnergyMachine() {

        AdhesiveTape Tape8 = new BoppTape(81, "ad139");
        GeometricTapeMachine machine = new GeometricTapeMachine();
        ChangeSurfaceEnergyStrategy myStrategy = new ChangeEnergyWithElectric(Tape8);

        machine.setStrategy(myStrategy);
        machine.runChangeSurfaceEnergyMachine(4.5);

    }
}