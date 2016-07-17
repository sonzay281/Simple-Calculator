/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fpc;

import com.leapfrog.fpc.command.Command;
import com.leapfrog.fpc.command.CommandFactory;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x = input.nextInt();
        System.out.print("Enter the value of y:");
        int y = input.nextInt();
        while(true){
        System.out.println("1.Add[+]\t2.Sub[-]\t3.Mul[*]\t\n4.Div[/]\t4.Pow[^]\t5.Max\t6.Min");
        System.out.print("Option:");
        String key=input.next();
          CommandFactory factory =new CommandFactory();
        Command c = factory.get(key);
        System.out.println(c.result(x, y));
            System.out.println("");
            System.out.println("Do you want to calculate more[Y/N]?");
            String option=input.next();
            if(option.equalsIgnoreCase("n")){
                System.out.println("See you soon dear :D");
                System.exit(1);
            }
         
         
        }
    }

}
