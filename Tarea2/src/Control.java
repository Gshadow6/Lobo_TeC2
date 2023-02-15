public class Control {
    private String tipo_sensor;
    private int botones;

    public Control() {
    }

    public Control(String tipo_sensor, int botones) {
        this.tipo_sensor = tipo_sensor;
        this.botones = botones;
    }

    public String getTipo_sensor() {
        return tipo_sensor;
    }

    public void setTipo_sensor(String tipo_sensor) {
        this.tipo_sensor = tipo_sensor;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    @Override
    public String toString() {
        return "Control{" +
                "tipo_sensor='" + tipo_sensor + '\'' +
                ", botones=" + botones +
                '}';
    }
}
