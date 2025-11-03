package br.com.fecaf.controller;

import br.com.fecaf.model.Usuario;
import br.com.fecaf.view.Home;
import br.com.fecaf.view.Login;

import java.util.ArrayList;

// Instâncias das Views e Controllers necessários.
public class HomeController {
    private Home home = new Home();
    private ControllerUsuario usuario = new ControllerUsuario();
    private Login login = new Login();

    //Lista para armazenar todos os usuários carregados da persistência
    private ArrayList<Usuario> usuarios;

    public void navegar() throws Exception {

        //Exibe o menu principal e captura a escolha do usuário
        int escolha = home.sistema();

        //Antes de qualquer ação, carrega todos os usuários persistidos.
        usuarios = usuario.carregarUsuario();

        //  Usa um switch para rotear a execução baseada na escolha do usuário.
        switch (escolha) {
            case 1: // Opção: Login

                // Pede as credenciais ao usuário através da View de Login.
                ArrayList<String> dadosInput = login.login();
                // Busca o usuário na lista carregada, verificando nome (índice 0) e senha (índice 1).
                boolean encontrou =  usuario.procurarUsuario(usuarios, dadosInput.get(0), dadosInput.get(1));


                // Exibe o resultado da tentativa de login.
                if(encontrou) System.out.println("Acesso liberado!");
                else System.out.println("Acesso negado!");
                break;

            case 2:// Opção: Cadastro
                // Delega a criação e salvamento de um novo usuário ao ControllerUsuario.
                usuario.salvarUsuario();
                break;
        }
    }
}

