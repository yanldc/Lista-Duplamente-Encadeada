/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.*;
/**
 *
 * @author yan-l
 */
public class Mavenproject1{
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[1000];

        for (int i = 0; i < 1000; i++) {
            numeros[i] = random.nextInt(19999) - 9999;
        }

        System.out.println("Números gerados na ordem de geração:");
        for (int i = 0; i < 1000; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        for (int i = 0; i < 1000; i++) {
            lista.inserirOrdenado(numeros[i]);
        }

        System.out.println("\nNúmeros inseridos na lista em ordem crescente:");
        lista.imprimirListaCrescente();

        System.out.println("\nNúmeros inseridos na lista em ordem decrescente:");
        lista.imprimirListaDecrescente();
    }
}
