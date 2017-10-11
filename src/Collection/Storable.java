package Collection;

import Resources.Exceptions.FileHandlingException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class Storable implements Resources.Collection.Storable {

    private String path;

    /**
     * Método construtor responsavél pela criação de uma instância de
     * {@link Storable}.
     *
     * @param path Caminho para o ficheiro.
     */
    public Storable(String path) {
        this.path = path;
    }

    /**
     * Método que permite armazenar um objecto num ficheiro.
     *
     * @param o Objeto a armazenar em ficheiro
     * @param string nome do ficheiro de destino
     * @return valor booleano sinalizando o sucesso/insucesso da operação
     * @throws FileHandlingException xceção que representa problemas no acesso e
     * escrita em ficheiro
     */
    @Override
    public boolean saveToFile(Object o, String string) throws FileHandlingException {
        File file = new File(string);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(o);
            }
        } catch (FileNotFoundException ex) {
            throw new FileHandlingException("Ficheiro não foi encontrado.");
        } catch (IOException ex) {
            throw new FileHandlingException("Não foi possivel guardar o ficheiro.");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                throw new FileHandlingException("Não foi possivel fechar o ficheiro.");
            }
        }

        System.out.println("Ficheiro guardado com sucesso. No caminho -> " + file.getPath());
        return true;
    }

    /**
     * Método que permite carregar um objecto em ficheiro.
     *
     * @param string nome do ficheiro a ser carregado.
     * @return booleano sinalizando o sucesso/insucesso da operação.
     * @throws FileHandlingException Exceção que representa problemas no acesso
     * e leitura em ficheiro.
     */
    @Override
    public Object loadFromFile(String string) throws FileHandlingException {
        FileInputStream fis = null;
        Object obj = new Object();
        try {
            fis = new FileInputStream(string);
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                obj = (Object) ois.readObject();
            }

        } catch (FileNotFoundException ex) {
            throw new FileHandlingException("Ficheiro não foi encontrado.");
        } catch (IOException ex) {
            throw new FileHandlingException("Não foi possivel ler o ficheiro.");
        } catch (ClassNotFoundException ex) {
            throw new FileHandlingException("Classe não existe.");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                throw new FileHandlingException("Não foi possivel fechar o ficheiro.");
            }
        }
        System.out.println("Ficheiro lido com sucesso.");
        return obj;
    }

    /**
     * Método para definir o caminho para o ficheiro.
     *
     * @param string Caminho para o ficheiro.
     */
    @Override
    public void setPath(String string) {
        this.path = string;
    }

    /**
     * Método que retorna o caminho para o ficheiro.
     *
     * @return Caminho para o ficheiro.
     */
    @Override
    public String getPath() {
        return this.path;
    }

}
