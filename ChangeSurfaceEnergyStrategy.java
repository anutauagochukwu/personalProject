/**
 * Name: Ugochukwu Anuta
 * Course: CS-665 Software Designs & Pattern
 * Date: 05/04/2023
 * File Name: ChangeSurfaceEnergyStrategy.java
 * Description:This class instantiations a strategy object which the implementation object dynamically
 * chooses at runtime
 */


package edu.bu.met.cs665.tapeMachineSoftware;

public interface ChangeSurfaceEnergyStrategy {

     /**
      * A method/behaviour common to all strategy
      * @param energyValue: the amount of energy to increase on the tapeSurface
      */
     public void changeSurfaceEnergy(double energyValue);

}
