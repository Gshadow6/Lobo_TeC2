package ico.fes.peliculas.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pelicula {
    private int clave;
    private String titulo;
    private String genero;
    private int cantidad;
    private int columna;
    private int fila;

    public boolean rentar(){

         if(this.cantidad > 0){
             this.cantidad --;
             return true;
         } else {
             return false;
         }
    }

    public boolean regresar(){
            this.cantidad ++;
            return true;
    }
}
