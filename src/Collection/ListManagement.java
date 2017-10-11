package Collection;

import Resources.Collection.ListManagementContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class ListManagement implements ListManagementContract, Serializable {

    private Object[] listManagement;
    private int tamMax;

    /**
     * Método construtor para a criação de uma instância de
     * {@link ListManagement listManagement} com a inicialização do vetor com um
     * tamanho por defeito de 30 posições.
     */
    public ListManagement() {
        this.listManagement = new Object[DEFAULT_SIZE];
        this.tamMax = DEFAULT_SIZE;
    }

    /**
     * Método construtor para a criação de uma instância de
     * {@link ListManagement listManagement} com a inicialização do vetor com um
     * determinado tamanho.
     *
     * @param maxSize Tamanho para inicialização do vetor
     * {@link ListManagement listManagement}.
     */
    public ListManagement(int maxSize) {
        this.listManagement = new Object[maxSize];
        this.tamMax = maxSize;
    }

    /**
     * Método responsável por retorna as posições do vetor
     * {@link ListManagement listManagement} actualmente preenchidas.
     *
     * @return Valor inteiro que indica quantas posições do vetor
     * {@link ListManagement listManagement} estão preenchidas.
     */
    public int posicoesPreenchidas() {
        int contador = 0;

        for (Object obj : this.listManagement) {
            if (obj != null) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * Método responsavél por adicionar um Objecto ao vetor
     * {@link ListManagement listManagement}.
     *
     * @param o Objeto a ser adicionado
     *
     * @return valor booleano que determina o sucesso ou insucesso da operação.
     */
    @Override
    public boolean addObject(Object o) {
        int tam = posicoesPreenchidas();
        if (tam < this.tamMax) {
            this.listManagement[tam] = o;

            return true;
        }

        return false;
    }

    /**
     * Método responsavél por eliminar um objeto do vetor
     * {@link ListManagement listManagement}.
     *
     * @param i Indice do objeto a ser eliminado
     *
     * @return Objeto eliminado
     */
    @Override
    public Object removeObject(int i) {
        Object tmpObject = this.listManagement[i];

        int index = findObject(tmpObject);
        if (index > -1) {
            Object[] tmp = new Object[DEFAULT_SIZE - 1];
            int cont = 0;
            for (int x = 0; x < DEFAULT_SIZE; x++) {
                if (x != index) {
                    tmp[cont] = this.listManagement[x];
                    cont++;
                }
            }
            this.listManagement = tmp;
            return tmpObject;
        }

        return null;

    }

    /**
     * Método responsavél por retornar um determinado Objeto do vetor
     * {@link ListManagement listManagement}.
     *
     * @param i Indice do objeto a ser retornado
     *
     * @return Objeto desejado.
     *
     * @throws ArrayIndexOutOfBoundsException Excepção apresentada quando o
     * indice passado é superior ao tamanho do vetor {@link ListManagement}.
     */
    @Override
    public Object getObject(int i) throws ArrayIndexOutOfBoundsException {
        if (i < posicoesPreenchidas()) {

            return this.listManagement[i];

        } else {
            throw new ArrayIndexOutOfBoundsException("Index superior ao tamanho do Array.");
        }
    }

    /**
     * Método responsavél por retornar o index de um determinado objeto do vetor
     * {@link ListManagement listManagement}.
     *
     * @param o Objeto a ser procurado.
     * @return Index do objeto.
     */
    @Override
    public int findObject(Object o) {
        for (int i = 0; i < posicoesPreenchidas(); i++) {
            if (this.listManagement[i].equals(o)) {
                return i;
            }

        }

        return -1;
    }

    /**
     * Metodo que permite ordenar pela ordem desejada para cada tipo de variavel
     * contida no vetor {@link ListManagement listManagement}.
     */
    @Override
    public void sort() {
        for (int i = 0; i < posicoesPreenchidas(); i++) {
            for (int j = 0; j < posicoesPreenchidas() - i - 1; j++) {
                Comparator compare = (Comparator) this.listManagement[j], comp1 = (Comparator) this.listManagement[j + 1];

                //Compara a valor da posição j com o da j+1
                if (compare.compareTo(comp1) > 1) {
                    //Se o valor da posição j for maior que o da posição j+1, trocam de posições
                    Object aux = this.listManagement[j];
                    this.listManagement[j] = this.listManagement[j + 1];
                    this.listManagement[j + 1] = aux;
                }

            }
        }
    }

    /**
     * Método responsavél por retornar o vetor
     * {@link ListManagement listManagement}.
     *
     * @return vetor {@link ListManagement listManagement}.
     */
    public Object[] getAll() {
        return this.listManagement;
    }

    /**
     * Método responsavél por retornar o tamanho máximo do vetor
     * {@link ListManagement listManagement}.
     *
     * @return Valor inteiro que determina o tamanho máximo do vetor
     * {@link ListManagement listManagement}.
     */
    public int getTamMax() {
        return tamMax;
    }

    /**
     * Método responsavél por substituir o valor da variavél tamMax.
     *
     * @param tamMax Novo valor inteiro.
     */
    private void setTamMax(int tamMax) {
        this.tamMax = tamMax;
    }

}
