package br.com.fecaf.view;

import java.util.Scanner;

public class CadastrarUsuario {

        Scanner scanner = new Scanner(System.in);

   // Metodo responsável por solicitar ao usuário as informações necessárias.
    // para o cadastro: nome, senha e e-mail.
    //Após a coleta, as informações são armazenadas em um array de

        public String[] cadastrar(){
            System.out.println("Informe seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Informe a senha:");
            String senha = scanner.nextLine();
            System.out.println("Informe seu email:");
            String email = scanner.nextLine();

            return new String[]{nome, senha, email};
        }
}
