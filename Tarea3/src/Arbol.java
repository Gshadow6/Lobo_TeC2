public class Arbol {
    private String nombre;
    private String colorMadera;

    public Arbol() {
    }

    public Arbol(String nombre, String colorMadera) {
        this.nombre = nombre;
        this.colorMadera = colorMadera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorMadera() {
        return colorMadera;
    }

    public void setColorMadera(String colorMadera) {
        this.colorMadera = colorMadera;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "nombre='" + nombre + '\'' +
                ", con color de madera='" + colorMadera + '\'' +
                '}';
    }
}
