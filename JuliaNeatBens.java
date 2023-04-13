/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.julianeatbens;

/**
 *
 * @author aluno
 */
public class JuliaNeatBens {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta2.saldo = 2500.00;
        conta1.saldo = 3000.00;
        conta1.saca = 5000.00;
        conta1.titular = "Júlia";
        conta1.deposita(300.00);
        conta1.transferir(1000.00, conta2);
        System.out.println("NOME: "+conta1.titular);
        System.out.println("SALDO ATUAL: "+conta1.saldo);
        System.out.println("O SALDO DA CONTA 2 APÓS A TRANSFERÊNCIA É DE: "+conta2.saldo);
    }
}
