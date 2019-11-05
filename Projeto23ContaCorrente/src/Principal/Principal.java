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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pessoa objPessoa1 = new Pessoa("Eduardo","Dias","1234567");
       Pessoa objPessoa2 = new Pessoa("Anderson","Gripa","10987654321");
       Conta objConta1 = new Conta(001,1000,500);
       Conta objConta2 = new Conta(002,2000,1000);
       Endereco objEnd01 = new Endereco("Rua1", "1", "Cidade1", "Estado1", "111111-111");
       Endereco objEnd02 = new Endereco("Rua2", "2", "Cidade2", "Estado2", "222222-222");
       
       objPessoa1.getNomeCompleto();
       objPessoa1.validarCPF(objPessoa1.getCPF());
       objEnd01.getLocalizacaoByCEP("111111-111");
       objPessoa2.getNomeCompleto();
       objPessoa2.validarCPF(objPessoa2.getCPF());
       objEnd02.getLocalizacaoByCEP("222222-222");
     
       
        objConta1.sacar(500);
        objConta1.depositar(2000);
        objConta1.transferir(1000, objConta2);
        
        
       
        
        objConta2.sacar(500);
        objConta2.depositar(3000);
        objConta2.transferir(100, objConta1);

       
       
    }
    
}
