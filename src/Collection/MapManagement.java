package Collection;

import Resources.Collection.MapEntryContract;
import Resources.Exceptions.DuplicateEntryException;
import Resources.Exceptions.EndOfCollectionException;
import Resources.Exceptions.KeyNotFoundException;
import Resources.Collection.MapManagementContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class MapManagement extends ListManagement implements MapManagementContract, Serializable {

    private int contNext;

    /**
     * Método construtor para a criação de uma instância de
     * {@link MapEntry mapEntry} com a inicialização do vetor
     * {@link ListManagement mapManagement} com um tamanho por defeito de 30
     * posições.
     */
    public MapManagement() {
        super();
        this.contNext = 0;
    }

    /**
     * ´* Método construtor para a criação de uma instância de
     * {@link MapEntry mapEntry} com a inicialização do vetor
     * {@link ListManagement mapManagement} com um determinado tamanho.
     *
     * @param maxSize Tamanho para inicialização do array.
     */
    public MapManagement(int maxSize) {
        super(maxSize);
        this.contNext = 0;
    }

    /**
     * Método que permite definir uma {@link MapEntry Entrada} identificada por
     * uma chave associada a um valor.
     *
     * @param o Objeto que representa a estrutura da chave
     * @param o1 valor associado à chave
     * @return valor que sinaliza o sucesso/insucesso da operação
     * @throws DuplicateEntryException exceção que representa os erros que podem
     * ocorrer no método de adição da chave
     */
    @Override
    public boolean addEntry(Object o, Object o1) throws DuplicateEntryException {
        MapEntry tmpEntry = new MapEntry(o, o1);

        if (findObject(tmpEntry) == -1) {
            return super.addObject(tmpEntry);
        } else {
            throw new DuplicateEntryException("Chave já existe");
        }
    }

    /**
     * Método responsável por verificar pela navegação entre as
     * {@link MapEntry Entrada} do mapa {@link ListManagement mapManagement}.
     *
     * @return Valor booleano que sinaliza o se existe/não existe animação
     * seguinte
     */
    @Override
    public boolean hasNext() {
        if (this.contNext <= super.posicoesPreenchidas()) {
            return true;
        }
        return false;

    }

    /**
     * Método responsável por verificar se existe uma próxima
     * {@link MapEntry Entrada} no mapa {@link ListManagement mapManagement}.
     *
     * @return a próxima {@link MapEntry Entrada}.
     * @throws EndOfCollectionException Exceção que sinaliza o fim do mapa.
     */
    @Override
    public MapEntryContract next() throws EndOfCollectionException {
        if (this.contNext < super.posicoesPreenchidas()) {
            this.contNext++;
            return (MapEntryContract) super.getObject(contNext - 1);
        } else {
            throw new EndOfCollectionException("Chegou ao Fim da Collection");
        }

    }

    /**
     * Método que permite retornar um valor associado a uma chave do mapa
     * {@link ListManagement mapManagement}.
     *
     * @param o Chave a ser procurada.
     * @return Valor associado à chave.
     * @throws KeyNotFoundException excecao que representa a ausência da chave
     * na coleção
     */
    @Override
    public Object getByKey(Object o) throws KeyNotFoundException {
        for (Object obj : super.getAll()) {
            if (obj instanceof MapEntry) {
                MapEntry map = (MapEntry) obj;
                if (map.getKey().equals(o)) {
                    return map.getValue();
                }
            }

        }
        throw new KeyNotFoundException("Não foi encontrada chave pretendida.");

    }

    /**
     * Método responsavél por retornar a posição do vetor
     * {@link ListManagement mapManagement} em que nos encontramos.
     *
     * @return Valor inteiro que indica o index em que nos encontramos.
     */
    public int getContNext() {
        return contNext;
    }

    /**
     * Método responsavél por alterar o valor de contNext.
     *
     * @param contNext Valor inteiro que vai substituir o actual.
     */
    private void setContNext(int contNext) {
        this.contNext = contNext;
    }

}
