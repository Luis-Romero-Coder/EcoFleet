/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecofleet.Modelo;

/**
 *
 * @author Coder
 */
public class Car implements Vehicle{
    private int id;
    private String trademark;
    private String model;
    private String plate;
    private boolean aviable;
    
    public Car(){}
    
    public Car(int id, String trademark, String model, String plate, boolean aviable){
        this.id = id;
        this.trademark = trademark;
        this.model = model;
        this.plate = plate;
        this.aviable = aviable;
    }
    
    @Override
    public String getType(){
        return "CAR";
    }
    
    @Override
    public void accelerate(int kmh){
        System.out.println("Auto acelerando a" + kmh + "km/h");
    }
    
    @Override
    public void curb(){
        System.out.println("Auto frenando");
    }
    
    @Override
    public double calculateCost(double kmElapsed){
        double baseRate = 20.0;
        double byKm = 10.0;
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
    
    public String getPlate(){
        return plate;
    }
    public void setPlate(String plate){
        this.plate = plate;
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
