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
public abstract class Command {

    private String result;

    public String getCalculation() {
        return result;
    }

    public void setCalculation(String result) {
        this.result = result;
    }

    public abstract double result(double x, double y);
}
