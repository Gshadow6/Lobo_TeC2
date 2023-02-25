public class Asiento {
    private int precio;
    private String material;
    private String color;
    private Boolean apoyabrazos;

    public Asiento() {
    }

    public Asiento(int precio, String material, String color, Boolean apoyabrazos) {
        this.precio = precio;
        this.material = material;
        this.color = color;
        this.apoyabrazos = apoyabrazos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getApoyabrazos() {
        return apoyabrazos;
    }

    public void setApoyabrazos(Boolean apoyabrazos) {
        this.apoyabrazos = apoyabrazos;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                " con un precio de $" + precio +
                " USD, con material de '" + material + '\'' +
                ", con color '" + color + '\'' +
                ", ¿Tiene apoyabrazos? " + apoyabrazos +
                '}';
    }
}
