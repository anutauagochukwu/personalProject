/**
 * Name: Ugochukwu Anuta
 * Course: CS-665 Software Designs & Pattern
 * Date: 05/04/2023
 * File Name: ChangeEnergyWithHeat.java
 * Description:This class instantiations a concrete strategy object which the implementation object dynamically
 * chooses at runtime
 */

package edu.bu.met.cs665.tapeMachineSoftware;

public class ChangeEnergyWithHeat implements ChangeSurfaceEnergyStrategy {

    /*The field attribute the method works on*/
    AdhesiveTape tape;

    /**
     * A method to instantiate a concrete strategy object
     * @param tape : the tape to change its surface energy
     */
    public ChangeEnergyWithHeat(AdhesiveTape tape){

        this.tape = tape;

    }


    @Override
    public void changeSurfaceEnergy(double heat) {

        tape.changeSurfaceEnergy(heat);
        System.out.println("The surface energy of the tape is change by heat temperature!");

    }
}
