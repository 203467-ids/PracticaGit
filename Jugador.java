public class Jugador {
private String nombre;
private String status;

public Jugador(String nombre, String status) {
    this.nombre = nombre;
    this.status = status;
}

 Jugador() {
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

@Override
public String toString() {
    return "Jugador[nombre=" + nombre + ", status=" + status + "]";
}


}