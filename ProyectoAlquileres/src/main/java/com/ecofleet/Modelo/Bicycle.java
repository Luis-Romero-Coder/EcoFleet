/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecofleet.Modelo;

/**
 *
 * @author Coder
 */
public class Bicycle implements Vehicle {
    private int id;
    private String trademark;
    private String model;
    private boolean aviable;
    
    public Bicycle(){}
    
    public Bicycle(int id, String trademark, String model, boolean aviable){
        this.id = id;
        this.trademark = trademark;
        this.model = model;
        this.aviable = aviable; 
    }
    
    @Override
    public String getType(){
        return "BICICLETA";
    }
    
    @Override
    public void accelerate(int kmh){
        System.out.println("Bicicleta pedaleando a " + kmh + "km/h");
    }
    
    @Override
    public void curb(){
        System.out.println("Bicicleta frenando");
    }
    
    @Override
    public double calculateCost(double kmElapsed){
        double baseRate = 2.0;
        double byKm = 1.0;
        return baseRate + byKm * kmElapsed;
    }
    //Setters y Getters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getTrademark(){
        return trademark;
    }
    public void setTrademark(String trademark){
        this.trademark = trademark;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    public boolean getAviable(){
        return aviable;
    }
    public void setAviable(boolean aviable){
        this.aviable = aviable;
    }
}
