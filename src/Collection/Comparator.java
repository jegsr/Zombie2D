package Collection;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro
 * Número: 8140166
 * Turma: 1
 */
public interface Comparator {
    /**
     * Método responsavél por fazer a comparação de um Objecto
     * 
     * @param obj Objeto a ser comparado
     * 
     * @return Retorna maior que -1 caso o obj seja maior, 0 caso seja igual ou maior que 1 caso o obj seja menor
     */
    public int compareTo(Comparator obj);
}
