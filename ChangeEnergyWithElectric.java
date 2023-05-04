/**
 * Name: Ugochukwu Anuta
 * Course: CS-665 Software Designs & Pattern
 * Date: 05/04/2023
 * File Name: ChangeEnergyWithElectric.java
 * Description:This class instantiations a concrete strategy object which the implementation object dynamically
 * chooses at runtime
 */


package edu.bu.met.cs665.tapeMachineSoftware;

public class ChangeEnergyWithElectric implements ChangeSurfaceEnergyStrategy{

    /*The field attribute the method works on*/
    AdhesiveTape tape;

    /**
     * A method to instantiate a concrete strategy object
     * @param tape : the tape to change its surface energy
     */
    public ChangeEnergyWithElectric(AdhesiveTape tape){

        this.tape = tape;

    }


    @Override
    public void changeSurfaceEnergy(double electricCharge) {

        tape.changeSurfaceEnergy(electricCharge);
        System.out.println("The surface energy of the tape is change by electric Charge!");

    }

}
