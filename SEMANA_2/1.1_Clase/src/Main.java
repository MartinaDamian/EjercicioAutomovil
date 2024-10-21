//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Auto mb = new Auto();
        mb.marca = "BMW";
        mb.color = "Blanco";
        mb.cilindraje = 3.2;
        System.out.println("La marca del auto es:" + mb.marca);
        System.out.println(mb.detalleauto());

        Motocicletas moto= new Motocicletas();
        System.out.println(moto.detallemoto());
    }
}