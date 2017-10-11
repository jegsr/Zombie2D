package GameClasses;

import Resources.GameCollisionRectangleContract;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class GameCollisionRectangle implements GameCollisionRectangleContract, Serializable {

    private int height;
    private int witdh;
    private float paddingX;
    private float paddingY;
    private float radius;
    private int coordX;
    private int coordY;

    /**
     * Método construtor para a criação de uma instância de
     * {@link GameCollisionRectangle colisão}.
     *
     * @param height Altura do retângulo
     * @param witdh Largura do retângulo
     * @param paddingX Preenchimento do retângulo no eixo do X
     * @param paddingY Preenchimento do retângulo no eixo do Y
     * @param radius Alcance do retângulo
     * @param coordX Valor para o eixo do X
     * @param coordY Valor para o eixo do Y
     */
    public GameCollisionRectangle(int height, int witdh, float paddingX, float paddingY, float radius, int coordX, int coordY) {
        this.height = height;
        this.witdh = witdh;
        this.paddingX = paddingX;
        this.paddingY = paddingY;
        this.radius = radius;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    /**
     * Método responsável por retornar o valor para o eixo do X.
     *
     * @return Valor para o eixo do X.
     */
    @Override
    public int getX() {
        return this.coordX;

    }

    /**
     * Método responsável por definir o valor para o eixo do X.
     *
     * @param i Valor para o eixo do X.
     */
    @Override
    public void setX(int i) {
        this.coordX = i;
    }

    /**
     * Método responsável por retornar o valor para o eixo do Y.
     *
     * @return Valor para o eixo do Y.
     */
    @Override
    public int getY() {
        return this.coordY;

    }

    /**
     * Método responsável por definir o valor para o eixo do Y.
     *
     * @param i Valor para o eixo do Y.
     */
    @Override
    public void setY(int i) {
        this.coordY = i;
    }

    /**
     * Método responsável por retornar a largura do retângulo.
     *
     * @return Valor para largura do retângulo.
     */
    @Override
    public int getWidth() {
        return this.witdh;
    }

    /**
     * Método responsável por definir a largura do retângulo.
     *
     * @param i Valor para largura do retângulo.
     */
    @Override
    public void setWidth(int i) {
        this.witdh = i;
    }

    /**
     * Método responsável por retornar a altura do retângulo.
     *
     * @return Valor para altura do retângulo.
     */
    @Override
    public int getHeigth() {
        return this.height;

    }

    /**
     * Método responsável por definir a altura do retângulo.
     *
     * @param i Valor para altura do retângulo.
     */
    @Override
    public void setHeigth(int i) {
        this.height = i;
    }

    /**
     * Método responsável por definir o alcance do retângulo.
     *
     * @param i Valor do alcance do retângulo.
     */
    @Override
    public void setRadius(int i) {
        this.radius = (float)i;
    }

    /**
     * Método responsável por retornar o alcance do retângulo.
     *
     * @return Valor do alcance do retângulo.
     */
    @Override
    public float getRadius() {
        return this.radius;

    }

    /**
     * Método responsável por definir o preenchimento do retângulo no eixo do X.
     *
     * @param f Valor do preenchimento do retângulo no eixo do X.
     */
    @Override
    public void setPaddingX(float f) {
        this.paddingX = f;
    }

    /**
     * Método responsável por retornar o preenchimento do retângulo no eixo do
     * X.
     *
     * @return Valor do preenchimento do retângulo no eixo do X.
     */
    @Override
    public float getPaddingX() {
        return this.paddingX;

    }

    /**
     * Método responsável por definir o preenchimento do retângulo no eixo do Y.
     *
     * @param f Valor do preenchimento do retângulo no eixo do Y.
     */
    @Override
    public void setPaddingY(float f) {
        this.paddingY = f;
    }

    /**
     * Método responsável por retornar o preenchimento do retângulo no eixo do
     * Y.
     *
     * @return Valor do preenchimento do retângulo no eixo do Y.
     */
    @Override
    public float getPaddingY() {
        return this.paddingY;

    }

}
