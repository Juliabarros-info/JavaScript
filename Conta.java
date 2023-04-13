/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.julianeatbens;

/**
 *
 * @author aluno
 */
public class Conta {
    String titular;
    double saldo;
    double saca;
    
    boolean saca( double quantidade){
        if(quantidade<=this.saldo){
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
            System.out.println("Saque OK");
            System.out.println("SEU NOVO SALDO É DE: " +this.saldo);
            return true;
        }else{
            System.out.println("SAQUE NÃO REALIZADO");
            return false;
        }
    }
    void deposita(double quantidade){
        if(quantidade<=10){
            System.out.println("ERRO!");
        }else{
            this.saldo += quantidade;
            System.out.println("DEPÓSITO OK!");
        }
    }
    void transferir(double valor, Conta contaA){
        boolean x;
        x = this.saca(valor);
        if (x==true){
            contaA.deposita(valor);
        }
        else{
            System.out.println("TRANSFERÊNCIA NÃO REALIZADA");
     }
    }
    }

