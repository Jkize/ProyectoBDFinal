package Modelo;

/**
 *
 * @author Jhoan Saavedra
 */

public class Categoria {
    private Integer codigo;
    private String nombre;

    public Categoria() {
    }

    public Categoria(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
