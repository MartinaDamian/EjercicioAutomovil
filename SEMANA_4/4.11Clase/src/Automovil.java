import javax.swing.*;

public class Automovil {
    private String marca;
    private String modelo;
    private String color = "Verde";
    private int cilindraje;
    private int kmph;
    private int cap;
    private int consumo=40;
    private float porConsumo;
    static String tipo = "SUV";
    public Automovil() {}

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, String color) {
        this(marca, modelo);
        this.color = color;
    }

    public Automovil(String marca, String modelo, String color, int cilindraje) {
        this(marca,modelo,color);
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getKmph() {
        return kmph;
    }

    public void setKmph(int kmph) {
        this.kmph = kmph;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public float getPorConsumo() {
        return porConsumo;
    }

    public void setPorConsumo(float porConsumo) {
        this.porConsumo = porConsumo;
    }

    public String verDetalle() {
        String sb = "La marca es -> " + this.getMarca() + "\nEl modelo es -> " + this.getModelo() +
                "\nEl color es -> " + this.color + "\nEl cilindraje es -> " + this.cilindraje + "\nEl tipo es -> " + Automovil.tipo;
        JOptionPane.showMessageDialog(null, sb);
        return sb;
    }
    public String acelerar(){
        return "El auto marca " + this.marca + " esta acelerado";
    }
    public String frenar(int kmph){
        return "El auto marca " + this.marca + " esta frenado a " + kmph + "\n";
    }
    public float capacidadTanque(int cap, float porConsumo){
        float cm= consumo/(cap*porConsumo);
        return cm;
    }
}
