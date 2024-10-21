public class Animales {
    String raza;
    String edad;
    Integer peso;
    String sexo;

    public Animales() {
    }

    public String detalleanimal() {
        StringBuilder an = new StringBuilder();
        an.append("\nLa raza de es:" + this.raza);
        an.append("\nLa edad de es:" + this.edad);
        an.append("\nLa peso de es:" + this.peso);
        an.append("\nLa sexo de es:" + this.sexo);
        return an.toString();
    }
}
