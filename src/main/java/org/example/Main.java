package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Healthplan plan1 = new Healthplan(1, "Standard Health Package", Plan.BASIC);
        Healthplan plan2 = new Healthplan(2, "Extended Health Insurance", Plan.PRO);
        Healthplan plan3 = new Healthplan(3, "VIP Health Plan", Plan.PREMIUM);

        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);

        Employee employee1 = new Employee(1, "Asli Ozcay", "asli@example.com", "askjdh123", new String[3]);
        Employee employee2 = new Employee(2, "Mustafa Ali Eren", "mali@example.com", "akjshdk345", new String[2]);

        System.out.println(employee1);
        System.out.println(employee2);

        Company company1 = new Company(101, "Ozcay's", 1500000.0, new String[3]);
        Company company2 = new Company(102, "Eren's", 2500000.0, new String[2]);

        System.out.println(company1);
        System.out.println(company2);
    }
}