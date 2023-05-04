/**
 * Name: Ugochukwu Anuta
 * Course: CS-665 Software Designs & Pattern
 * Date: 05/04/2023
 * File Name: AdhesiveTape.java
 * Description:This class instantiations a concrete implementation object the does the work delegated
 * by the abstraction class
 */

package edu.bu.met.cs665.tapeMachineSoftware;

public abstract class AdhesiveTape {

    /*set of attributes all adhesive tapes must have*/
    double amountOfAdhesiveOnTape = 0.000;
    double ovenHeat;
    double width;
    int laminationPressure;
    String adhesive;
    double primaryUnwindTension, rewindTension, secondaryUnwindTension;
    double primaryUnwindSpeed, secondaryUnwindSpeed, rewindSpeed;
    double surfaceEnergy;


    /**
     * A constructor method to instantiate an adhesive tape
     * @param width: with of a tape web
     * @param adhesive: the tape of adhesive to apply on the tape
     */
    public AdhesiveTape(double width, String adhesive){

        this.width = width;
        this.adhesive = adhesive;
        System.out.println("Tape of width " + width + " and adhesive " + adhesive + " is to be produced.");

    }

    public void setPrimarySpeed(double speed){

        primaryUnwindSpeed = speed;
        System.out.println("PrimaryUnwindMachine running at speed: " + primaryUnwindSpeed);

    }

    public void setUnwindTension(double tension){

        primaryUnwindTension = tension;
        System.out.println("PrimaryUnwindMachine running at setTension of: " + primaryUnwindTension);

    }

    public void setLaminationPressure(int pressure){

        laminationPressure = pressure;
        System.out.println("LaminationMachine running with pressure of : " + laminationPressure);
    }

    public void setAmountOfAdhesiveOnTape(double coatWeight){

         amountOfAdhesiveOnTape = coatWeight;
         System.out.println("Adhesive coatingHead running applying adhesive with coatWeight of : " + amountOfAdhesiveOnTape);

    }

    public double measureCoatWeight(){

        return amountOfAdhesiveOnTape;

    }

    public void setRewindTension(double tension){

        rewindTension = tension;
        System.out.println("RewindMachine running, with setTension of: " + rewindTension);

    }

    public void setSecondaryUnwindSpeed(double speed){

        secondaryUnwindSpeed = speed;
        System.out.println("SecondaryUnwindMachine running at speed: " + secondaryUnwindSpeed);
    }

    public void setSecondaryUnwindTension(double tension){

        secondaryUnwindTension = tension;
        System.out.println("SecondaryUnwindMachine running, with setTension of: " + secondaryUnwindTension);
    }

    public void setHeat(double heatTemp){

        ovenHeat = heatTemp;
        System.out.println("The Oven heat is set at Temperature: " + ovenHeat) ;
    }

    public void setRewindSpeed(double speed){

        rewindSpeed = speed;
        System.out.println("RewindMachine running at speed: " + rewindSpeed );

    }

    public void changeSurfaceEnergy(double energyValue){

        surfaceEnergy = energyValue;
        System.out.println("The surface Energy of the tape is increased by "+ surfaceEnergy);
    }
}
