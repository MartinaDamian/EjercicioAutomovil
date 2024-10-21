public class Automovil {
    public String marca;
    public String modelo;
    public String color = "Verde";
    public int cilindraje;

    public String verDetalle() {
        String sb = "La marca es -> " + this.marca + "\nEl modelo es -> " + this.modelo +
                "\nEl color es -> " + this.color + "\nEl cilindraje es -> " + this.cilindraje + "\n";
        return sb;
    }
}
