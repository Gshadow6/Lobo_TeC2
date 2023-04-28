package ico.fes.peliculas.model;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Reporte {
    Date fecha;
    Pelicula pelicula;
    String accion;

    public Reporte(Date fecha, Pelicula pelicula, String accion) {
        this.fecha = fecha;
        this.pelicula = pelicula;
        this.accion = accion;
    }
}
