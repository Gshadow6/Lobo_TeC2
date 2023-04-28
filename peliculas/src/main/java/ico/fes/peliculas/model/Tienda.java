package ico.fes.peliculas.model;

import java.util.ArrayList;
import java.util.Date;

public class Tienda {
    ArrayList<Pelicula> stock;
    ArrayList<Reporte> bitacora;
    int rentadas=0;

    public ArrayList<Reporte> getBitacora() {
        return bitacora;
    }

    public void setBitacora(ArrayList<Reporte> bitacora) {
        this.bitacora = bitacora;
    }

    public Tienda(ArrayList<Pelicula> stock) {
        this.stock = stock;
    }

    public ArrayList<Pelicula> getStock() {
        return stock;
    }

     public int getRentadas(){
        return rentadas;
     }

    public void setStock(ArrayList<Pelicula> stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "stock=" + stock +
                '}';
    }

    public boolean rentarPelicula(int id){
        Pelicula pel = null;
        for (Pelicula aux: this.stock) {
            if(aux.getClave() == id){
                pel = aux;
                bitacora.add(new Reporte(new Date(), pel, "Rentar"));
            }
        }
        if(pel == null){
            return false;
        } else {
            rentadas++;
            System.out.println(rentadas);
            return pel.rentar();
        }
    }

    public boolean regresarPelicula(int id){
        Pelicula pel = null;
        for (Pelicula aux: this.stock) {
            if(aux.getClave() == id){
                pel = aux;
                bitacora.add(new Reporte(new Date(), pel, "Regresar"));
            }
        }
        if(pel == null){
            return false;
        } else {
            return pel.regresar();
        }
    }
    public Pelicula regresarId (int id){
        for (Pelicula aux: this.stock) {
            if(aux.getClave() == id){
                return aux;
        }} return new Pelicula();
    }

    public Pelicula cambiar(int clave, Pelicula laPeli){
        for (int i = 0; i < stock.size(); i++) {
            if(stock.get(i).getClave() == clave){
                stock.set(i, laPeli);
            }
        }
        return laPeli;
    }

    public Tienda() {
        stock = new ArrayList<>();
        bitacora = new ArrayList<>();
        stock.add(new Pelicula(1, "Avatar", "Ciencia Ficcion", 10, 0, 0));
        stock.add(new Pelicula(2, "Caroline", "Animado", 3, 0, 1));
        stock.add(new Pelicula(3, "Robots", "Ciencia Ficcion", 2, 1, 0));
        stock.add(new Pelicula(4, "Yo leyenda", "Accion", 1, 1, 1));
        stock.add(new Pelicula(5, "Shrek", "Parodia", 7, 2, 0));
    }
}
