/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author aluno
 */
public class Conta
{
    private int numero;
    private double saldo;
    private double limite;
//Construtores
//Vazio
    public Conta()
    {
    }
//Cheio
    public Conta(int numero, double saldo, double limite)
    {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
//Getters & Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    //Metodos#1   
    public void sacar(double valor)
    { 
        if(this.saldo >= valor)
        {
            this.saldo = this.saldo - valor;
            System.out.println("\nSaldo após o saque: " + this.saldo);
        }
        else
        {
            System.out.println("\nSaldo insuficiente.");
        }
    }
    //Metodo#2
    public void depositar(double valor)
    {
        this.saldo = this.saldo + valor;
        System.out.println("\nSaldo após o depósito: " + this.saldo);
    }
    //Metodo#3
    public void transferir(double valor, Conta objConta)
    {
        if(this.saldo >= valor)
        {
            sacar(valor);
            objConta.depositar(valor);
        }
        else
        {
            System.out.println("\nTransferência não permitida.");
        }
    }
    
}
