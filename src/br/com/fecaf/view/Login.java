package br.com.fecaf.view;

import java.util.ArrayList;
import java.util.Scanner;

  // View responsável por capturar as credenciais de login do usuário
public class Login {

      // Objeto Scanner para leitura de entrada do console.
    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> login() {

        // Solicita e lê o nome de usuário.

        System.out.println("Digite o seu usuário:");
        String usuario = scanner.nextLine();

        // Solicita e lê a senha.
        System.out.println("Digite a sua senha:");
        String senha = scanner.nextLine();

        // Cria a lista para armazenar as credenciais.
        ArrayList<String> dados = new ArrayList<>();
        dados.add(usuario);
        dados.add(senha);

        // Retorna a lista de dados para o Controller.
        return dados;
    }
}

