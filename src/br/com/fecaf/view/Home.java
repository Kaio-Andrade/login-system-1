package br.com.fecaf.view;

import java.util.Scanner;

public class Home {

        Scanner scanner = new Scanner(System.in);

        public int sistema() {
            System.out.println("Bem vindo!");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            return escolha;
        }
    }


