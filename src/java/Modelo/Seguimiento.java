package Modelo;

/**
 * SEGUIIENTO V.1
 * 
 * @author Sebastian
 * @since 13-10-18
 */

public class Seguimiento {

    private String Estado;
    private String HoraInicio;
    private String HoraFin;
    private String Observaciones; 

    public Seguimiento(String Estado, String HoraInicio, String HoraFin, String Observaciones) {
        this.Estado = Estado;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.Observaciones = Observaciones;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
}
