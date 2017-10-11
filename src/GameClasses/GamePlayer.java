package GameClasses;

import Collection.MapManagement;
import Resources.Enums.PlayerMovementDirection;
import Resources.Exceptions.DuplicateEntryException;
import Resources.Exceptions.KeyNotFoundException;
import Resources.GameAnimationContract;
import Resources.GamePlayerContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class GamePlayer extends GameObject implements GamePlayerContract, Serializable {

    private boolean mapLimits;
    private MapManagement mapManagement;

    /**
     * Método construtor para a criação de uma instância de
     * {@link GamePlayer jogador}, com inicialização do vetor
     * {@link MapManagement mapManagement} com um tamanho máximo por defeito.
     *
     * @param mapLimits indica se o {@link GamePlayer jogador} pode ou não
     * passar os limites do mapa.
     * @param name Nome do {@link GamePlayer jogador}.
     * @param coordX Posição no eixo do X do {@link GamePlayer jogador}.
     * @param coordY Posição no eixo do Y do {@link GamePlayer jogador}.
     * @param heigth Altura do {@link GamePlayer jogador}.
     * @param width Largura do {@link GamePlayer jogador}.
     * @param collision {@link GamePlayer jogador} possuí ou não colisão.
     * @param hitbox {@link GameCollisionRectangle colisão} do
     * {@link GamePlayer jogador}.
     */
    public GamePlayer(boolean mapLimits, String name, int coordX, int coordY, int heigth, int width, boolean collision, GameCollisionRectangle hitbox) {
        super(name, coordX, coordY, heigth, width, collision, null, hitbox);
        this.mapLimits = mapLimits;
        this.mapManagement = new MapManagement();
    }

    /**
     * Método construtor para a criação de uma instância de
     * {@link GamePlayer jogador}, com inicialização do vetor
     * {@link MapManagement mapManagement} com um tamanho máximo desejado.
     *
     * @param mapLimits indica se o {@link GamePlayer jogador} pode ou não
     * passar os limites do mapa.
     * @param name Nome do {@link GamePlayer jogador}.
     * @param coordX Posição no eixo do X do {@link GamePlayer jogador}.
     * @param coordY Posição no eixo do Y do {@link GamePlayer jogador}.
     * @param heigth Altura do {@link GamePlayer jogador}.
     * @param width Largura do {@link GamePlayer jogador}.
     * @param collision {@link GamePlayer jogador} possuí ou não colisão.
     * @param hitbox {@link GameCollisionRectangle colisão} do
     * {@link GamePlayer jogador}.
     * @param maxSize tamanho instânciação do vetor de
     * {@link MapManagement mapManagement}.
     */
    public GamePlayer(boolean mapLimits, String name, int coordX, int coordY, int heigth, int width, boolean collision, GameCollisionRectangle hitbox, int maxSize) {
        super(name, coordX, coordY, heigth, width, collision, null, hitbox);
        this.mapLimits = mapLimits;
        this.mapManagement = new MapManagement(maxSize);
    }

    /**
     * Método responsavél por definir se o {@link GamePlayer jogador} pode ou
     * não ultrapassar os limites do {@link GameScenario cenário}.
     *
     * @param bln valor booleano que sinaliza que um {@link GamePlayer jogador}
     * pode/não pode ultrapassar os limites do {@link GameScenario cenário}.
     */
    @Override
    public void setMapLimits(boolean bln) {
        this.mapLimits = bln;
    }

    /**
     * Método responsavél por retornar se o {@link GamePlayer jogador} pode ou
     * não ultrapassar os limites do {@link GameScenario cenário}.
     *
     * @return valor booleano que sinaliza que um {@link GamePlayer jogador}
     * pode/não pode ultrapassar os limites do {@link GameScenario cenário}.
     */
    @Override
    public boolean getMapLimits() {
        return this.mapLimits;
    }

    /**
     * Método responsável por adicionar uma {@link GameAnimation animação}
     * associada a um {@link PlayerMovementDirection movimento} do
     * {@link GamePlayer jogador} no vetor de
     * {@link MapManagement mapManagement}.
     *
     * @param pmd {@link PlayerMovementDirection movimento} do
     * {@link GamePlayer jogador}.
     * @param gac {@link GameAnimation animação} associada a um
     * {@link PlayerMovementDirection movimento}.
     */
    @Override
    public void addAnimation(PlayerMovementDirection pmd, GameAnimationContract gac) {
        try {
            this.mapManagement.addEntry(pmd, gac);
        } catch (DuplicateEntryException ex) {
            System.out.println(ex.toString());
        }

    }

    /**
     * Método que retornar uma {@link GameAnimation animação} associada a um
     * {@link PlayerMovementDirection movimento} do {@link GamePlayer jogador}.
     *
     * @param pmd {@link PlayerMovementDirection movimento} do
     * {@link GamePlayer jogador}.
     * @return {@link GameAnimation animação} associada a um
     * {@link PlayerMovementDirection movimento}.
     */
    @Override
    public GameAnimationContract getAnimation(PlayerMovementDirection pmd) {
        try {
            return (GameAnimation) this.mapManagement.getByKey(pmd);
        } catch (KeyNotFoundException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }

    /**
     * Método responsavél por imprimir uma descrição textual (nome, altura e
     * largura) do jogador e a sua posição em termos de coordenadas(X,Y).
     */
    @Override
    public void playerDescription() {
        System.out.println("Player Name: " + super.getName() + " Player X: " + super.getX() + " Player Y: " + super.getY() + " Player Width: " + super.getWidth() + " Player Heigth: " + super.getHeigth());
    }

    /**
     * Método responsavél por retornar o vetor
     * {@link MapManagement mapManagement}.
     *
     * @return vetor {@link MapManagement mapManagement}.
     */
    public MapManagement getMapManagement() {
        return mapManagement;
    }

    /**
     * Método responsavél por definir o vetor
     * {@link MapManagement mapManagement}.
     *
     * @param mapManagement vetor {@link MapManagement mapManagement}.
     */
    public void setMapManagement(MapManagement mapManagement) {
        this.mapManagement = mapManagement;
    }

}
