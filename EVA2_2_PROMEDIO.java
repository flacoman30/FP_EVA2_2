/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa,sumaCalifa;  
        Scanner captu=new Scanner(System.in);
        sumaCalifa=0;
        for(int i = 1;i < 30;i++){
        
        
        System.out.println("Estudiante #" + i); 
       System.out.println("cual es tu califacion");
        califa=captu.nextInt();
        captu.nextLine();
        sumaCalifa= sumaCalifa + califa;
        int promedio = sumaCalifa / 10;
        System.out.println("sumaCalifa ="+sumaCalifa);
        //calcular el promedio
        
        }
    }
    
}
