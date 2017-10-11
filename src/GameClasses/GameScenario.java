package GameClasses;

import Collection.ListManagement;
import Resources.Collection.ListManagementContract;
import Resources.GameObjectContract;
import Resources.GameScenarioContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class GameScenario extends ListManagement implements GameScenarioContract, Serializable {

    private int id;
    private String name;
    private int width;
    private int heigth;
    private String backgroundImage;
    private String music;

    /**
     * Método construtor para a inicialização do vetor
     * {@link ListManagement objetosCenario} com um tamanho máximo por defeito
     * (30 Posições).
     *
     * @param id Identificador do {@link GameScenario cenário}.
     * @param name Nome do {@link GameScenario cenário}.
     * @param width Largura do {@link GameScenario cenário}.
     * @param heigth Altura do {@link GameScenario cenário}.
     * @param backgroundImage Imagem de fundo do {@link GameScenario cenário}.
     * @param music Musica do {@link GameScenario cenário}.
     */
    public GameScenario(int id, String name, int width, int heigth, String backgroundImage, String music) {
        super();
        this.id = id;
        this.name = name;
        this.width = width;
        this.heigth = heigth;
        this.backgroundImage = backgroundImage;
        this.music = music;

    }

    /**
     * Método construtor para a inicialização do vetor
     * {@link ListManagement objetosCenario} com um determinado tamanho máximo.
     *
     * @param id Identificador do {@link GameScenario cenário}.
     * @param name Nome do {@link GameScenario cenário}.
     * @param width Largura do {@link GameScenario cenário}.
     * @param heigth Altura do {@link GameScenario cenário}.
     * @param backgroundImage Imagem de fundo do {@link GameScenario cenário}.
     * @param music Musica do {@link GameScenario cenário}.
     * @param maxSize tamanho máximo do vetor
     * {@link ListManagement objetosCenario}.
     */
    public GameScenario(int id, String name, int width, int heigth, String backgroundImage, String music, int maxSize) {
        super(maxSize);
        this.id = id;
        this.name = name;
        this.width = width;
        this.heigth = heigth;
        this.backgroundImage = backgroundImage;
        this.music = music;
    }

    /**
     * Método responsavél por retornar o nome do {@link GameScenario cenário}.
     *
     * @return nome do {@link GameScenario cenário}.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Método responsavél por definir o nome do {@link GameScenario cenário}.
     *
     * @param string nome do {@link GameScenario cenário}.
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }

    /**
     * Método responsavél por definir a largura do {@link GameScenario cenário}.
     *
     * @param i largura do {@link GameScenario cenário}.
     */
    @Override
    public void setWidth(int i) {
        this.width = i;
    }

    /**
     * Método responsavél por retornar a largura do
     * {@link GameScenario cenário}.
     *
     * @return largura do {@link GameScenario cenário}.
     */
    @Override
    public int getWidth() {
        return this.width;
    }

    /**
     * Método responsavél por definir a altura do {@link GameScenario cenário}.
     *
     * @param i altura do {@link GameScenario cenário}.
     */
    @Override
    public void setHeigth(int i) {
        this.heigth = i;
    }

    /**
     * Método responsavél por retornar a altura do {@link GameScenario cenário}.
     *
     * @return altura do {@link GameScenario cenário}.
     */
    @Override
    public int getHeigth() {
        return this.heigth;
    }

    /**
     * Método responsavél por definir o identificador do
     * {@link GameScenario cenário}.
     *
     * @param i identificador do {@link GameScenario cenário}.
     */
    @Override
    public void setID(int i) {
        this.id = i;
    }

    /**
     * Método responsavél por retornar o identificador do
     * {@link GameScenario cenário}.
     *
     * @return identificador do {@link GameScenario cenário}.
     */
    @Override
    public int getID() {
        return this.id;
    }

    /**
     * Método responsavél por definir a imagem de fundo do
     * {@link GameScenario cenário}.
     *
     * @param string imagem de fundo do {@link GameScenario cenário}.
     */
    @Override
    public void setBackgroundImage(String string) {
        this.backgroundImage = string;
    }

    /**
     * Método responsavél por retornar a imagem de fundo do
     * {@link GameScenario cenário}.
     *
     * @return imagem de fundo do {@link GameScenario cenário}.
     */
    @Override
    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    /**
     * Método responsavél por definir a música do {@link GameScenario cenário}.
     *
     * @param string música do {@link GameScenario cenário}.
     */
    @Override
    public void setBackgroundMusic(String string) {
        this.music = string;
    }

    /**
     * Método responsavél por retornar a música do {@link GameScenario cenário}.
     *
     * @return música do {@link GameScenario cenário}.
     */
    @Override
    public String getBackgroundMusic() {
        return this.music;
    }

    /**
     * Método responsavél por adicionar um {@link GameObject objecto} ao
     * {@link GameScenario cenário}.
     *
     * @param goc {@link GameObject objecto} a ser adicionado.
     * @return valor booleano que determina o sucesso/insucesso da operação.
     */
    @Override
    public boolean addGameObject(GameObjectContract goc) {
        return super.addObject(goc);
    }

    /**
     * Método responsavél por retornar um {@link GameObject objecto} do
     * {@link GameScenario cenário} tendo por base o seu indice no vetor de
     * {@link ListManagement objetosCenario}.
     *
     * @param i Indice do {@link GameObject objecto} no vetor
     * {@link ListManagement objetosCenario}.
     * @return {@link GameObject objecto} no vetor
     * {@link ListManagement objetosCenario}.
     */
    @Override
    public GameObjectContract getGameObject(int i) {
        return (GameObject) super.getObject(i);
    }

    /**
     * Método responsavél por definir o mapa de
     * {@link GameCollisionRectangle colisões} para um dado
     * {@link GameScenario cenário}.
     *
     * @return {@link ListManagement coleção} de elementos do tipo
     * {@link GameCollisionRectangle} que representa a área de
     * {@link GameCollisionRectangle colisão} de cada {@link GameObject objeto}
     * do {@link GameScenario cenário}.
     */
    @Override
    public ListManagementContract colisionMapping() {
        ListManagement colisionMap = new ListManagement();
        for (Object obj : super.getAll()) {
            if (obj != null) {
                if (obj instanceof GameObject) {
                    if (((GameObject) obj).hasCollision() == true) {
                        colisionMap.addObject(((GameObject) obj).getCollision());
                    }
                }
            }
        }

        return colisionMap;

    }

    /**
     * Método responsavél por retornar o número de {@link GameObject objetos} no
     * {@link GameScenario cenário}.
     *
     * @return número de {@link GameObject objetos} no
     * {@link GameScenario cenário}.
     */
    @Override
    public int getNumberOfObjects() {
        return super.posicoesPreenchidas();
    }
}
