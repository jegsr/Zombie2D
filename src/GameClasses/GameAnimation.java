package GameClasses;

import Collection.ListManagement;
import java.nio.file.InvalidPathException;
import Resources.GameAnimationContract;
import java.io.File;
import java.io.Serializable;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class GameAnimation implements GameAnimationContract, Serializable {

    private String pastaImagens;
    private int duration;
    private int heigth;
    private int width;
    private ListManagement imageList;

    /**
     * Método responsavél pela criação de uma instância de
     * {@link GameAnimation animação}.
     *
     * @param pastaImagens Diretório onde se encontram as sprites de
     * {@link GameAnimation animação}.
     * @param duration Duração de actualização da sprite de
     * {@link GameAnimation animação}.
     * @param heigth Altura das sprites de {@link GameAnimation animação}.
     * @param width Largura das sprites de {@link GameAnimation animação}.
     */
    public GameAnimation(String pastaImagens, int duration, int heigth, int width) {
        this.pastaImagens = pastaImagens;
        this.duration = duration;
        this.heigth = heigth;
        this.width = width;
    }

    /**
     * Método responsável por ler um conjunto de imagens a partir de uma pasta
     * e adiciona-las ao vetor de {@link ListManagement imageList}.
     *
     * @throws InvalidPathException Erro que sinaliza que uma determinada pasta
     * ou caminho não existe
     */
    @Override
    public void loadImagesFromFolder() throws InvalidPathException {
        File dir = new File(this.pastaImagens);

        if (dir.exists()) {
            File[] fileList = dir.listFiles();
            this.imageList = new ListManagement(fileList.length);

            for (File file : fileList) {
                if (file.getName().endsWith("png")) {
                    this.imageList.addObject(file.getName());
                }
            }
        } else {
            throw new InvalidPathException(pastaImagens, "Caminho não existe.");
        }

    }

    /**
     * Método responsável por definir a escala das imagens da {@link GameAnimation animação}
     *
     * @param i a largura das imagens
     * @param i1 a altura das imagens
     */
    @Override
    public void setScale(int i, int i1) {
        this.width = i;
        this.heigth = i1;

    }

    /**
     * Método responsável por retornar a largura das imagens da {@link GameAnimation animação}
     *
     * @return largura das imagens da {@link GameAnimation animação}
     */
    @Override
    public int getWidth() {
        return this.width;

    }

    /**
     * Método responsável por retornar a altura das imagens da {@link GameAnimation animação}
     *
     * @return altura das imagens da {@link GameAnimation animação}
     */
    @Override
    public int getHeigth() {
        return this.heigth;

    }

    /**
     * Método responsável por definir o caminho para um conjunto de imagens.
     *
     * @param string o caminho para as imagens
     */
    @Override
    public void setImagePath(String string) {
        this.pastaImagens = string;
    }

    /**
     * Método responsável por retornar o caminho para um conjunto de imagens.
     *
     * @return o caminho para as imagens.
     */
    @Override
    public String getImagePath() {
        return this.pastaImagens;

    }

    /**
     * Método responsável por definir a duração em milisegundos em que cada
     * imagem da {@link GameAnimation animação} é atualizado.
     *
     * @param i a duração em milissegundos
     */
    @Override
    public void setAvgDuration(int i) {
        this.duration = i;
    }

    /**
     * Método responsável por retornar a duração em milissegundos em que cada
     * imagem da {@link GameAnimation animação} é atualizado.
     *
     * @return a duração em milissegundos
     */
    @Override
    public int getAvgDuration() {
        return this.duration;

    }

    /**
     * Método responsavél por retornar vetor de
     * {@link ListManagement imageList} que tem todas as imagens de uma
     * {@link GameAnimation animação}.
     *
     * @return vetor {@link ListManagement imageList} que têm todas as
     * imagens da {@link GameAnimation animação}.
     */
    public ListManagement getImageList() {
        return imageList;
    }

    /**
     * Método responsavél por definir o vetor de
     * {@link ListManagement imageList} que tem todas as imagens de uma
     * {@link GameAnimation animação}.
     *
     * @param imageList vetor de {@link ListManagement imageList} de imagens.
     */
    public void setImageList(ListManagement imageList) {
        this.imageList = imageList;
    }
}
