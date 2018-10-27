package Modelo;

/**
 *
 * @author Jhoan Saavedra
 */

public class Suplente extends Empleado {

    private Operador operador;
    private String fechaInicio;
    private String fechaFin;

    public Suplente() {
    }

    public Suplente(String correo, String nombre, String contraseña, String cargo, Operador operador, String fechaInicio, String fechaFin) {
        super(correo, nombre, contraseña, cargo);
        this.operador = operador;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

}
