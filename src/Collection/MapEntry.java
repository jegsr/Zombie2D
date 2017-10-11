package Collection;

import java.io.Serializable;
import java.util.Objects;
import Resources.Collection.MapEntryContract;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class MapEntry implements MapEntryContract, Serializable {

    private Object key;
    private Object value;

    /**
     * Método construtor para a criação de uma instância de {@link MapEntry}
     *
     * @param key Objeto chave
     * @param value Objeto valor
     */
    public MapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Método responsavél por substituir o Objeto Key da {@link MapEntry}
     *
     * @param o Objeto que vai substituir o Objeto actual.
     */
    @Override
    public void setKey(Object o) {
        this.key = o;
    }

    /**
     * Método responsavél por substituir o Objeto Value da {@link MapEntry}
     *
     * @param o Objeto que vai substituir o Objeto actual.
     */
    @Override
    public void setValue(Object o) {
        this.value = o;
    }

    /**
     * Método responsavél por retornar a Key.
     *
     * @return Objeto Key a ser retornado.
     */
    @Override
    public Object getKey() {
        return this.key;
    }

    /**
     * Método responsavél por retornar o Value.
     *
     * @return Objeto Value a ser retornado.
     */
    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.key);
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
        final MapEntry other = (MapEntry) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return true;
    }

}
