/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fpc.command;

/**
 *
 * @author Anonymous
 */
public class CommandFactory {

    public static Command get(String key) {
        if (key.equalsIgnoreCase("+")) {
            return new AddCommand();
        } else if (key.equalsIgnoreCase("-")) {
            return new SubCommand();
        } else if (key.equalsIgnoreCase("*")) {
            return new MulCommand();
        } else if (key.equalsIgnoreCase("/")) {
            return new DivCommand();
        } else if (key.equalsIgnoreCase("^")) {
            return new Pow2Command();
        } else if (key.equalsIgnoreCase("Max")) {
            return new MaxCommand();
        } else if (key.equalsIgnoreCase("Min")) {
            return new MinCommand();
        }

        return null;
    }
 

}
