public class SmartTv {
    private float pulgadas;
    private String marca;
    private  Control control;

    public SmartTv() {
    }

    public SmartTv(float pulgadas, String marca, Control control) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.control = control;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", control=" + control +
                '}';
    }
}
