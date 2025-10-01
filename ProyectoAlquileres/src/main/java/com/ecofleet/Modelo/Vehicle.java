/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecofleet.Modelo;

/**
 *
 * @author Coder
 */
public interface Vehicle {
    String getType(); 
    void accelerate(int kmh);
    void curb();
    double calculateCost(double kmElepsed);
}
