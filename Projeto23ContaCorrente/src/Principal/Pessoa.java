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
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String CPF;
    
//Construtores
//Vazio
    public Pessoa()
    {
    }
//Cheio
    public Pessoa(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }
//Getters & Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
//Métodos#1
public void validarCPF(String cpf)
{
   
  if(cpf.length() != 11)  
        System.out.println("CPF Inválido !!");
  else
        System.out.println("Situação CPF: OK!!");
} 
//Método#2
public void getNomeCompleto()
{
    System.out.println(this.nome + " " + this.sobrenome);
}
}
