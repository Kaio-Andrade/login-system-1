package br.com.fecaf.controller;

import br.com.fecaf.model.Usuario;
import br.com.fecaf.view.CadastrarUsuario;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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


}
