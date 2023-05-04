package edu.bu.met.cs665.tapeMachineSoftware;
/**
 * Name: Ugochukwu Anuta
 * Course: CS-665 Software Designs & Pattern
 * Date: 05/04/2023
 * File Name: TapeMachine.java
 * Description:This is an abstraction class, this delegates work to the implementation.
 */


public abstract class TapeMachine {

    /* The field attribute is a bridge pattern design implemented by aggregation */
    protected AdhesiveTape bridgeTape;

    /* This field attribute is a strategy in this context class */
    ChangeSurfaceEnergyStrategy strategy;

    /**
     * A constructor method to create a tapeMachine object
     * @param tape: an AdhesiveTape  bridge object
     */
    public TapeMachine(AdhesiveTape tape){

        this.bridgeTape = tape;

    }

    public TapeMachine() {

    }

    public void runUnwindMachine(int speed, double tension){

        bridgeTape.setPrimarySpeed(speed);
        bridgeTape.setUnwindTension(tension);

    }

    public void runCoatingHead(double coatWeight){

        bridgeTape.setAmountOfAdhesiveOnTape(coatWeight);

    }

    public void runOvenHeat(double temperature){

        bridgeTape.setHeat(temperature);

    }

    public double measureAdhesive(){

         return bridgeTape.measureCoatWeight();

    }

    public void runLaminationMachine(int pressure){

        bridgeTape.setLaminationPressure(pressure);

    }

    public void runRewindMachine(int speed, double tension){

        bridgeTape.setRewindSpeed(speed);
        bridgeTape.setRewindTension(tension);

    }

    public void runSecondaryUnwind(double speed, double tension){

        bridgeTape.setSecondaryUnwindSpeed(speed);
        bridgeTape.setSecondaryUnwindTension(tension);

    }

    public void setStrategy(ChangeSurfaceEnergyStrategy strategy){

        this.strategy = strategy;

    }

    public void runChangeSurfaceEnergyMachine(double charge) {

        strategy.changeSurfaceEnergy(charge);

    }
}
