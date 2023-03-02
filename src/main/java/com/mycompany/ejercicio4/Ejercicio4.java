package com.mycompany.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.print("Ingrese el número: ");
        Scanner Num= new Scanner(System.in);
        double N = Num.nextInt();
        
        System.out.println("El cuadrado de "+N+" es "+Math.pow(N, 2));
        System.out.println("El cubo de "+N+" es "+Math.pow(N, 3));
        
    }
}
