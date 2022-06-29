/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author anatoly
 */
public class Squeak implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
    
}