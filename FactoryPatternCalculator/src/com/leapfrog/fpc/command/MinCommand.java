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
public class MinCommand extends Command {

    @Override
    public double result(double x, double y) {
        double min;
        if (x < y) {
            min = x;
        } else {
            min = y;
        }
        return min;
    }

}
