/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stuni
 */
package com.mycompany.practic1_6;
public class Gardener {
      public void filter(Plant plant){
        String filteredName = plant.getName().replaceAll("[aeiouAEIOU]", "");
        filteredName = filteredName + "VGTBL";
        System.out.println(filteredName);
    }
}
