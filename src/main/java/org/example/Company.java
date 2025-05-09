package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;
    public Company(int id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        if(giro>0) {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index provided.");
            return;
        }
        if(developerNames[index] == null){
            developerNames[index] = name;
        }
        else{
            System.out.println("The specified index is full.");
        }
    }

    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Giro: " + giro + ", Developers: " + Arrays.toString(developerNames);
    }
}
