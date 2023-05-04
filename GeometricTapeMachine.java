/**
 * Name: Ugochukwu Anuta
 * Course: CS-665 Software Designs & Pattern
 * Date: 05/04/2023
 * File Name: GeometricTapeMachine.java
 * Description: This class instantiations a concrete abstraction object.
 */



package edu.bu.met.cs665.tapeMachineSoftware;

public class GeometricTapeMachine extends TapeMachine{

    /**
     * A constructor method to create a tapeMachine object
     * @param tape : an AdhesiveTape bridge object
     */
    public GeometricTapeMachine(AdhesiveTape tape) {
        super(tape);
    }

    public GeometricTapeMachine(){

        super();
    }
}
