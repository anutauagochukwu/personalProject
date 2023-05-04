/**
 * Name: Ugochukwu Anuta
 * Course: CS-665 Software Designs & Pattern
 * Date: 05/04/2023
 * File Name: FoilTape.java
 * Description:This class instantiations a concrete implementation object the does the work delegated
 * by the abstraction class
 */


package edu.bu.met.cs665.tapeMachineSoftware;

public class FoilTape extends AdhesiveTape {

    /**
     * A constructor method to instantiates a concrete foilTape object
     * @param width:
     * @param adhesive:
     */
    public FoilTape(double width, String adhesive) {

        super(width, adhesive);

    }

}
