package ico.fes.peliculas.controller;

import ico.fes.peliculas.model.Pelicula;
import ico.fes.peliculas.model.Reporte;
import ico.fes.peliculas.model.Tienda;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class TiendaController {
    Tienda tienda;

    public TiendaController() {
        tienda = new Tienda();
    }

    @GetMapping("/peliculas")
    public ResponseEntity<ArrayList<Pelicula>> getPeliculas(){
        return new ResponseEntity<>(tienda.getStock(), HttpStatus.OK);
    }

    @PostMapping("/rentar")
    public ResponseEntity<Boolean> vender(@RequestBody(required = true) Pelicula pel){
        return new ResponseEntity<>(tienda.rentarPelicula(pel.getClave()), HttpStatus.OK);
    }

    @PostMapping("/regresar")
    public ResponseEntity<Boolean> regresar(@RequestBody(required = true) Pelicula pel){
        return new ResponseEntity<>(tienda.regresarPelicula(pel.getClave()), HttpStatus.OK);
    }

    @GetMapping("/peliculas/{id}")
    public ResponseEntity<Pelicula> getPeliculasById(@PathVariable(required = true,name="id")int clave){

        return new ResponseEntity<>(tienda.regresarId(clave),HttpStatus.OK);
    }

    @PatchMapping("/cambiar")
    public ResponseEntity<Pelicula> changePeliculasByID(@RequestBody(required = true) Pelicula pelicula){

        return new ResponseEntity<>(tienda.cambiar(pelicula.getClave(), pelicula), HttpStatus.OK);
    }

    @GetMapping("/reporte/rentas")
    public ResponseEntity<String> getReporteRentadas(){
        return new ResponseEntity<>(("El reporte de peliculas rentadas es "+tienda.getRentadas()), HttpStatus.OK);
    }

    @GetMapping("/reporte/balance")
    public ResponseEntity<String> getReporteBalance(){
        return new ResponseEntity<>(("La ganancia de las peliculas rentadas es "+(tienda.getRentadas())*20), HttpStatus.OK);
    }

    @GetMapping("/reporte/bitacora")
    public ResponseEntity<ArrayList<Reporte>> getReporteBitacora(){
        return new ResponseEntity<>(tienda.getBitacora(), HttpStatus.OK);
    }

    @GetMapping("/rentar/{columna}/{fila}")
    public ResponseEntity<Boolean> venderPorPosicion(@PathVariable(required = true, name = "columna") int columna, @PathVariable(required = true, name = "fila") int fila){
        Optional<Pelicula> pelicula = this.tienda.getStock().stream()
                .filter((peliculaAux) -> (peliculaAux.getFila() == fila && peliculaAux.getColumna() == columna))
                .findFirst();
        if(pelicula.isPresent()) return new ResponseEntity<>(tienda.rentarPelicula(pelicula.get().getClave()), HttpStatus.OK);
        else return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
    }

}
