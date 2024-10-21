public class Motocicletas {
    String colorimetria = "Morado";
    double precio = 6000.0;
    String year = "2005";
    double kilometraje = 20000.0;

    public Motocicletas() {
    }

    public String detallemoto() {
        StringBuilder mo= new StringBuilder();
        mo.append("moto.year = " + this.year);
        mo.append("\nmoto.precio = " + this.precio);
        mo.append("\nmoto.colorimetria = " + this.colorimetria);
        mo.append("\nmoto.kilometraje = " + this.kilometraje);
        return mo.toString();
    }
}
