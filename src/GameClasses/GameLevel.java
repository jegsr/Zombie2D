package GameClasses;

import Collection.Comparator;
import Resources.GamePlayerContract;
import Resources.GameScenarioContract;
import Resources.GameLevelContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class GameLevel implements GameLevelContract, Comparator, Serializable {

    private GameScenario scenario;
    private GamePlayer player;
    private boolean debug;
    private int id;
    private String levelName;

    /**
     * Método construtor responsavél pela criação de uma instância de
     * {@link GameLevel Nível}.
     *
     * @param scenario {@link GameScenario cenário} do {@link GameLevel nível}.
     * @param player {@link GamePlayer jogador} do {@link GameLevel nível}.
     * @param debug Mode de depuração do {@link GameLevel nível}.
     * @param id Identificador do {@link GameLevel nível}.
     * @param levelName Nome do {@link GameLevel nível}.
     */
    public GameLevel(GameScenario scenario, GamePlayer player, boolean debug, int id, String levelName) {
        this.scenario = scenario;
        this.player = player;
        this.debug = debug;
        this.id = id;
        this.levelName = levelName;

    }

    /**
     * Método responsável por definir um {@link GameScenario cenário} de um
     * determinado {@link GameLevel nível}.
     *
     * @param gsc {@link GameScenario cenário}
     */
    @Override
    public void setScenario(GameScenarioContract gsc) {
        this.scenario = (GameScenario) gsc;
    }

    /**
     * Método responsável por retornar um {@link GameScenario cenário} de um
     * determinado {@link GameLevel nível}.
     *
     * @return {@link GameScenario cenário}
     */
    @Override
    public GameScenarioContract getScenario() {
        return this.scenario;

    }

    /**
     * Método responsável por definir um {@link GamePlayer jogador} num
     * determinado {@link GameLevel nível}.
     *
     * @param gpc {@link GamePlayer jogador}.
     */
    @Override
    public void setPlayer(GamePlayerContract gpc) {
        this.player = (GamePlayer) gpc;
    }

    /**
     * Método responsável por retornar um {@link GamePlayer jogador} num
     * determinado {@link GameLevel nível}.
     *
     * @return {@link GamePlayer jogador}.
     */
    @Override
    public GamePlayerContract getPlayer() {
        return this.player;

    }

    /**
     * Método responsável por definir o modo de execução do
     * {@link GameLevel nível} (true/false significa que o jogo será/não será
     * executado em modo de depuração, respectivamente)
     *
     * @param bln valor booleano sinalizando a utilização/não utilização do
     * método de depuração.
     */
    @Override
    public void setDebug(boolean bln) {
        this.debug = bln;
    }

    /**
     * Método responsável por retornar a configuração do modo de depuração do
     * {@link GameLevel nível}.
     *
     * @return valor booleano sinalizando a utilização/não utilização do método
     * de depuração.
     */
    @Override
    public boolean getDebug() {
        return this.debug;

    }

    /**
     * Método responsável por definir o identificador do
     * {@link GameLevel nível}.
     *
     * @param i Identificador do {@link GameLevel nível}.
     */
    @Override
    public void setId(int i) {
        this.id = i;
    }

    /**
     * Método responsavél por retornar o identificador do
     * {@link GameLevel nível}.
     *
     * @return Identificador do {@link GameLevel nível}.
     */
    @Override
    public int getId() {
        return this.id;

    }

    /**
     * Método responsavél por imprimir uma descrição textual do
     * {@link GameLevel nível}.
     */
    @Override
    public void levelDescription() {
        System.out.println("Level ID -> " + this.getId() + " Level Name -> " + this.getLevelName());
    }

    /**
     * Método responsavél por retornar o nome do {@link GameLevel nível}.
     *
     * @return nome do {@link GameLevel nível}.
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * Método responsavél por definir o nome do {@link GameLevel nível}.
     *
     * @param levelName nome do {@link GameLevel nível}.
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    /**
     * Método responsavél por comparar o nome do {@link GameLevel nível}.
     *
     * @param obj {@link GameLevel nível} com que se vai comparar.
     * @return maior que -1 caso seja maior, 0 caso seja igual ou maior que 1
     * caso seja menor.
     */
    @Override
    public int compareTo(Comparator obj) {
        GameLevel level = (GameLevel) obj;
        return this.levelName.compareTo(level.getLevelName());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GameLevel other = (GameLevel) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
