/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practic1_6;
import java.util.Scanner;

/**
 *
 * @author stuni
 */
public class Practic1_6 {
    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Grigorev Pavel, RIBO-01-22, Variant 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the plant: ");
        String plantName = scanner.nextLine();
        Plant plant = new Plant(plantName);
        Gardener gardener = new Gardener();
        gardener.filter(plant);
        System.out.println("Original name: " + plant.getName() + ", " + "Filtered name: " + plant.getName().replaceAll("[aeiouAEIOU]", "") + "VGTBL");
    }
}
