/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author yan-l
 */

public class ListaDuplamenteEncadeada {
    private No cabeca;
    private No cauda;

    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void inserirOrdenado(int valor) {
        No novoNo = new No(valor);

        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else if (valor <= cabeca.valor) {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        } else if (valor >= cauda.valor) {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null && atual.proximo.valor < valor) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            novoNo.anterior = atual;
            atual.proximo.anterior = novoNo;
            atual.proximo = novoNo;
        }
    }

    public void imprimirListaCrescente() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirListaDecrescente() {
        No atual = cauda;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}
