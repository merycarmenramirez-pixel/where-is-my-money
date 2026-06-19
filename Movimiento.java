import java.time.LocalDate;
public class Movimiento{
    private LocalDate fecha;
    private String descripcion;
    private double monto;
    private String cuentaOrigen;
    private String cuentaDestino;

Movimiento (LocalDate fecha, String descripcion, double monto, String cuentaOrigen, String cuentaDestino){
    this.fecha = fecha;
    this.descripcion = descripcion;
    this.monto = monto;
    this.cuentaOrigen = cuentaOrigen;
    this.cuentaDestino = cuentaDestino;
    }

public LocalDate getFecha() {
    return fecha;
}

public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public double getMonto() {
    return monto;
}

public void setMonto(double monto) {
    this.monto = monto;
}

public String getCuentaOrigen() {
    return cuentaOrigen;
}

public void setCuentaOrigen(String cuentaOrigen) {
    this.cuentaOrigen = cuentaOrigen;
}

public String getCuentaDestino() {
    return cuentaDestino;
}

public void setCuentaDestino(String cuentaDestino) {
    this.cuentaDestino = cuentaDestino;
}





}