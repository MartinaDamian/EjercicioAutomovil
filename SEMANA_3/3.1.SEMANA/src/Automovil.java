public class Automovil {
    private String marca;
    private String modelo;
    private String color = "Verde";
    private int cilindraje;
    private int kmph;
    private int cap;
    private int consumo=40;
    private float porConsumo;
    public Automovil() {}
    public Automovil(String marca, String modelo, String color, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
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
                "\nEl color es -> " + this.color + "\nEl cilindraje es -> " + this.cilindraje + "\n";
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
