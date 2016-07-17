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
public class Calculator {

    private Command cmd;

    public Calculator() {
    }

    public Calculator(Command cmd) {
        this.cmd = cmd;
    }

    public Command getCommand() {
        return cmd;
    }

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }

}
