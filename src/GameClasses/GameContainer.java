package GameClasses;

import Collection.ListManagement;
import Resources.Exceptions.DuplicateLevelsId;
import Resources.GameLevelContract;
import Resources.GameContainerContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class GameContainer extends ListManagement implements GameContainerContract, Serializable {

    private boolean debug;
    private String name;

    /**
     * Instância de {@link GameContainer container} a ser inicializada.
     */
    private static final GameContainer INSTANCE
            = new GameContainer();

    /**
     * Método construtor para a criação de uma instância de
     * {@link GameContainer container}, com inicialização do vetor de
     * {@link ListManagement Niveis},construtor com acesso privado para prevenir
     * outra qualquer classe de conseguir criar instâncias.
     */
    private GameContainer() {
        super();
    }

    /**
     * Método que retorna a instância de {@link GameContainer}
     *
     * @return {@link GameContainer INSTANCE} de {@link GameContainer}.
     */
    public static GameContainer getInstance() {
        return INSTANCE;
    }

    /**
     * Método responsavél por inicializar as variavéis
     * {@link GameContainer debug} e {@link GameContainer name} do
     * {@link GameContainer container}.
     *
     * @param debug Valor booleano a definido para {@link GameContainer debug}.
     * @param name Nome a ser definido para {@link GameContainer name}.
     */
    public void setGameContainer(boolean debug, String name) {
        this.debug = debug;
        this.name = name;
    }

    /**
     * Método responsável por adicionar um novo {GameLevel Nível} ao
     * {@link ListManagement Niveis}.
     *
     * @param glc {GameLevel Nível} a ser adicionado.
     * @return Valor booleano que sinaliza o sucesso/insucesso da operação.
     * @throws DuplicateLevelsId Exceção que representa a existência de dois
     * níveis com o mesmo idenficador.
     */
    @Override
    public boolean addNewLevel(GameLevelContract glc) throws DuplicateLevelsId {
        if (super.findObject(glc) == -1) {
            return super.addObject(glc);
        } else {
            throw new DuplicateLevelsId("Id já existente noutro nível.");
        }
    }

    /**
     * Método responsável por eliminar um {GameLevel Nível} ao
     * {@link ListManagement Niveis}.
     *
     * @param glc {GameLevel Nível} a ser eliminado.
     * @return Valor booleano que sinaliza o sucesso/insucesso da operação.
     */
    @Override
    public boolean removeLevel(GameLevelContract glc) {
        int index = super.findObject(glc);

        if (index != -1) {
            super.removeObject(index);
        }
        return false;

    }

    /**
     * Método responsável por retornar um {GameLevel Nível} recebendo um índice.
     *
     * @param i índice do vetor {@link ListManagement Niveis} em que se pretende
     * obter o {GameLevel Nível}.
     * @return {GameLevel Nível} no índice especificado.
     * @throws ArrayIndexOutOfBoundsException Exceção que representa que o
     * indice passado é maior que o tamanho do vetor
     * {@link ListManagement Niveis} ou é negativo.
     */
    @Override
    public GameLevelContract getLevel(int i) throws ArrayIndexOutOfBoundsException {
        if ((GameLevel) super.getObject(i) != null) {
            return (GameLevel) super.getObject(i);
        } else {
            throw new ArrayIndexOutOfBoundsException("Não existe esse nível");
        }
    }

    /**
     * Método responsável por retornar o número de {GameLevel Níveis}
     *
     * @return Número de {GameLevel Níveis}.
     */
    @Override
    public int getSize() {
        return super.posicoesPreenchidas();
    }

    /**
     * Método responsável por retornar a configuração do modo de depuração.
     *
     * @return booleano sinalizando a utilização/não utilização do método de
     * depuração.
     */
    @Override
    public boolean getDebugMode() {
        return this.debug;

    }

    /**
     * Método responsável por definir o modo de execução do jogo (true/false
     * significa que o jogo será/não será executado em modo de depuração,
     * respetivamente)
     *
     * @param bln valor booleano sinalizando a utilização/não utilização do
     * método de depuração.
     */
    @Override
    public void setDebugMode(boolean bln) {
        this.debug = bln;
    }

    /**
     * Método responsável por definir o nome do {@link GameContainer jogo}.
     *
     * @param string Nome do {@link GameContainer jogo}.
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }

    /**
     * Método responsável por retornar o nome do {@link GameContainer jogo}.
     *
     * @return Nome do {@link GameContainer jogo}.
     */
    @Override
    public String getName() {
        return this.name;

    }
}
