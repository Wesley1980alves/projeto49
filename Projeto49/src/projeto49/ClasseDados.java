/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto49;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class ClasseDados {

    public int numeros(int numeros) {
        Scanner ent = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        int media = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º numero");
            num = ent.nextInt();

            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            media = numeros / num;

        }

        System.out.println("Foram digitados " + contPar + " numeros pares ");
        System.out.println("Foram digitados " + contPar + " numeros impares ");
        System.out.println("Media " + media);
        return 0;

    }
}
