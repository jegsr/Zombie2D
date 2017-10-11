package GameClasses;

import Collection.Comparator;
import Resources.GameObjectContract;
import Resources.Exceptions.ObjectException;
import Resources.GameAnimationContract;
import Resources.GameCollisionRectangleContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class GameObject implements GameObjectContract, Comparator, Serializable {

    private String name;
    private int coordX;
    private int coordY;
    private int heigth;
    private int width;
    private boolean collision;
    private boolean isColliding;
    private GameAnimation animation;
    private GameCollisionRectangle hitbox;

    /**
     * Método construtor para a criação de uma instância de
     * {@link GameObject Objeto} com todas as variavéis de instância.
     *
     * @param name Nome do {@link GameObject Objeto}.
     * @param coordX Posição no eixo do X do {@link GameObject Objeto}.
     * @param coordY Posição no eixo do Y do {@link GameObject Objeto}.
     * @param heigth Altura do {@link GameObject Objeto}.
     * @param width Largura do {@link GameObject Objeto}.
     * @param collision {@link GameObject Objeto} possuí ou não colisão.
     * @param isColliding {@link GameObject Objeto} está ou não em colisão.
     * @param animation {@link GameAnimation animação} do
     * {@link GameObject Objeto}.
     * @param hitbox {@link GameCollisionRectangle colisão} do
     * {@link GameObject Objeto}.
     */
    public GameObject(String name, int coordX, int coordY, int heigth, int width, boolean collision, boolean isColliding, GameAnimation animation, GameCollisionRectangle hitbox) {
        this.name = name;
        this.coordX = coordX;
        this.coordY = coordY;
        this.heigth = heigth;
        this.width = width;
        this.collision = collision;
        this.isColliding = isColliding;
        this.animation = animation;
        this.hitbox = hitbox;
    }

    /**
     * Método construtor para a criação de uma instância de
     * {@link GameObject Objeto} sem a variavél de instância 
     * {@link GameObject isColliding}.
     *
     * @param name Nome do {@link GameObject Objeto}.
     * @param coordX Posição no eixo do X do {@link GameObject Objeto}.
     * @param coordY Posição no eixo do Y do {@link GameObject Objeto}.
     * @param heigth Altura do {@link GameObject Objeto}.
     * @param width Largura do {@link GameObject Objeto}.
     * @param collision {@link GameObject Objeto} possuí ou não colisão.
     * @param animation {@link GameAnimation animação} do
     * {@link GameObject Objeto}.
     * @param hitbox {@link GameCollisionRectangle colisão} do
     * {@link GameObject Objeto}.
     */
    public GameObject(String name, int coordX, int coordY, int heigth, int width, boolean collision, GameAnimation animation, GameCollisionRectangle hitbox) {
        this.name = name;
        this.coordX = coordX;
        this.coordY = coordY;
        this.heigth = heigth;
        this.width = width;
        this.collision = collision;
        this.animation = animation;
        this.hitbox = hitbox;
        this.isColliding = false;
    }

    /**
     * Método responsável por verificar se o {@link GameObject Objeto}
     * possui/não possui colisão
     *
     * @return valor booleano sinalizando se possui/não possui colisão.
     */
    @Override
    public boolean hasCollision() {
        return this.collision;

    }

    /**
     * Método responsável por definir se o {@link GameObject Objeto} possui/não
     * possui colisão (true/false significa que o objeto terá/não terá colisão,
     * respectivamente))
     *
     * @param bln valor booleano sinalizando se possui/não possui colisão.
     */
    @Override
    public void setCollision(boolean bln) {
        this.collision = bln;
    }

    /**
     * Método responsável por definir uma {@link GameAnimation animação}
     * associado ao {@link GameObject Objeto}.
     *
     * @param gac {@link GameAnimation animação} associado ao
     * {@link GameObject Objeto}.
     * @throws ObjectException Exceção que representa a existência de erro
     * relacionado com a animação associada ao objeto.
     */
    @Override
    public void setAnimation(GameAnimationContract gac) throws ObjectException {
        if (gac != null) {
            this.animation = (GameAnimation) gac;
        } else {
            throw new ObjectException("Não tem animação.");
        }

    }

    /**
     * Método responsável por retornar uma {@link GameAnimation animação}
     * associado ao {@link GameObject Objeto}.
     *
     * @return {@link GameAnimation animação} associado ao
     * {@link GameObject Objeto}.
     * @throws ObjectException Exceção que representa a existência de erro
     * relacionado com a animação associada ao objeto
     */
    @Override
    public GameAnimationContract getAnimation() throws ObjectException {
        if (this.animation != null) {
            return this.animation;
        } else {
            throw new ObjectException("Não tem animação.");
        }
    }

    /**
     * Método responsavél por retornar a largura do {@link GameObject Objeto}.
     *
     * @return largura do {@link GameObject Objeto}.
     */
    @Override
    public int getWidth() {
        return this.width;

    }

    /**
     * Método responsavél por definir a largura do {@link GameObject Objeto}.
     *
     * @param i largura do {@link GameObject Objeto}.
     */
    @Override
    public void setWidth(int i) {
        this.width = i;
    }

    /**
     * Método responsavél por retornar a altura do {@link GameObject Objeto}.
     *
     * @return altura do {@link GameObject Objeto}.
     */
    @Override
    public int getHeigth() {
        return this.heigth;

    }

    /**
     * Método responsavél por definir a altura do {@link GameObject Objeto}.
     *
     * @param i altura do {@link GameObject Objeto}.
     */
    @Override
    public void setHeigth(int i) {
        this.heigth = i;
    }

    /**
     * Método responsavél por retornar a posição no eixo dos X
     * do{@link GameObject Objeto}.
     *
     * @return posição no eixo dos X do {@link GameObject Objeto}.
     */
    @Override
    public int getX() {
        return this.coordX;

    }

    /**
     * Método responsavél por definir a posição no eixo dos X do
     * {@link GameObject Objeto}.
     *
     * @param i posição no eixo dos X do {@link GameObject Objeto}.
     */
    @Override
    public void setX(int i) {
        this.coordX = i;
    }

    /**
     * Método responsavél por retornar a posição no eixo dos Y do
     * {@link GameObject Objeto}.
     *
     * @return posição no eixo dos Y do {@link GameObject Objeto}.
     */
    @Override
    public int getY() {
        return this.coordY;

    }

    /**
     * Método responsavél por definir a posição no eixo dos Y do
     * {@link GameObject Objeto}.
     *
     * @param i posição no eixo dos Y do {@link GameObject Objeto}.
     */
    @Override
    public void setY(int i) {
        this.coordY = i;
    }

    /**
     * Método responsavél por definir as configurações de
     * {@link GameCollisionRectangleContract colisão} do
     * {@link GameObject Objeto}.
     *
     * @param gcrc configurações da
     * {@link GameCollisionRectangleContract colisão}.
     */
    @Override
    public void setCollision(GameCollisionRectangleContract gcrc) {
        this.hitbox = (GameCollisionRectangle) gcrc;
    }

    /**
     * Método responsavél por retornar as configurações de
     * {@link GameCollisionRectangleContract colisão} do
     * {@link GameObject Objeto}.
     *
     * @return configurações da {@link GameCollisionRectangleContract colisão}.
     */
    @Override
    public GameCollisionRectangleContract getCollision() {
        return this.hitbox;

    }

    /**
     * Método responsavél por indicar que o {@link GameObject Objeto} está em
     * {@link GameCollisionRectangleContract colisão}.
     *
     * @param bln valor booleano sinalizando que está/não está em
     * {@link GameCollisionRectangleContract colisão}.
     */
    @Override
    public void setIsColliding(boolean bln) {
        this.isColliding = bln;
    }

    /**
     * Método responsavél por retornar se {@link GameObject Objeto} está em
     * {@link GameCollisionRectangleContract colisão}.
     *
     * @return valor booleano sinalizando que está/não está em
     * {@link GameCollisionRectangleContract colisão}.
     */
    @Override
    public boolean getIsColliding() {
        return this.isColliding;

    }

    /**
     * Método responsavél por retornar o nome do {@link GameObject Objeto}.
     *
     * @return nome do {@link GameObject Objeto}.
     */
    @Override
    public String getName() {
        return this.name;

    }

    /**
     * Método responsavél por definir o nome do {@link GameObject Objeto}.
     *
     * @param string nome do {@link GameObject Objeto}.
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }

    /**
     * Método responsavél por comparar o nome do {@link GameObject Objeto}.
     *
     * @param obj {@link GameObject Objeto} com que se vai comparar.
     * @return maior que -1 caso seja maior, 0 caso seja igual ou maior que 1
     * caso seja menor.
     */
    @Override
    public int compareTo(Comparator obj) {
        GameObject object = (GameObject) obj;
        return this.name.compareTo(object.getName());
    }
}
