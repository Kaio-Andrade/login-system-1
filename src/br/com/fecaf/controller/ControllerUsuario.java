package br.com.fecaf.controller;

import br.com.fecaf.model.Usuario;
import br.com.fecaf.view.CadastrarUsuario;

import java.io.*;
import java.util.ArrayList;

public class ControllerUsuario {


    public void salvarUsuario() throws Exception {
        // Interage com a View para obter os dados do usuário.
        CadastrarUsuario view = new CadastrarUsuario();

        // Cria uma nova instância de Usuario com os dados fornecidos pela view.
        //  O metodo cadastrar() da view deve retornar um array.
        Usuario pessoa = new Usuario(view.cadastrar());


        // Serializar (objeto -> arquivo)
        String nomeArquivo = pessoa.getNome().replace(" ", "_").toLowerCase();
        File pasta = new File("database");
        if (!pasta.exists()) {
            pasta.mkdirs();
        }
        // Prepara o caminho completo do arquivo de serialização.
        File arquivo = new File(pasta, nomeArquivo + ".ser");

        // Fluxo de bytes para escrita no arquivo
        FileOutputStream fos = new FileOutputStream(arquivo);

        // Fluxo de objetos para serializar o objeto Usuario.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Serializa (escreve) o objeto 'pessoa' no arquivo.
        oos.writeObject(pessoa);

        // Fecha o fluxo de escrita, liberando recursos.
        oos.close();
    }


    public static String[] listarArquivosSer(String caminhoDiretorio) {

        //Cria um objeto File representando o diretório.
        File dir = new File(caminhoDiretorio);

        // Lista dinâmica para armazenar os nomes dos arquivos .ser
        ArrayList<String> arquivosSer = new ArrayList<>();

        //Verifica se o caminho fornecido é de fato um diretório.
        if (dir.isDirectory()) {
            File[] arquivos = dir.listFiles();

            // Verifica se a lista de arquivos não é nula
            if (arquivos != null) {

                //Itera sobre cada item encontrado no diretório
                for (File f : arquivos) {

                    //Filtra: verifica se é um arquivo e se termina com ".ser"
                    if (f.isFile() && f.getName().endsWith(".ser")) {
                        arquivosSer.add(f.getName());
                    }
                }
            }
        }

        return arquivosSer.toArray(new String[0]); // converte ArrayList para array
    }

    public ArrayList<Usuario> carregarUsuario() throws Exception {

       // Obtém a lista de nomes dos arquivos .ser (usuários salvos) do diretório "database"
        String[] usuariosSer = listarArquivosSer("database");

        // Inicializa a lista que armazenará os objetos Usuario desserializados.
        ArrayList<Usuario> usuarios = new ArrayList<>();

        //  Itera sobre cada nome de arquivo .ser encontrado.
        for(String usuario : usuariosSer) {
            // Desserializar (arquivo -> objeto)

            //  Configura o fluxo de entrada de bytes para o arquivo.
            FileInputStream fis = new FileInputStream("database//" + usuario);

            //  Configura o fluxo de objetos para ler o objeto do fluxo de bytes.
            ObjectInputStream ois = new ObjectInputStream(fis);


            // Lê (desserializa) o objeto e faz o casting para a classe Usuario.
            Usuario pessoa = (Usuario) ois.readObject();

            // . Adiciona o objeto carregado à lista.
            usuarios.add(pessoa);

            //  Fecha o fluxo de leitura, liberando recursos.
            ois.close();
        }
        //  Retorna a lista completa de usuários.
        return usuarios;


    }
}
