public class Auto {
    String marca = "AMV";
    String modelo = "332";
    String color = "Negro";
    double cilindraje = 12000.0;

    public Auto() {
    }

    public String detalleauto() {
        StringBuilder sb = new StringBuilder();
        sb.append("La marca de auto es :" + this.marca);
        sb.append("\nauto modelo = " + this.modelo);
        sb.append("\nauto color = " + this.color);
        sb.append("\nauto.cilindraje = " + this.cilindraje);
        return sb.toString();
    }
}
