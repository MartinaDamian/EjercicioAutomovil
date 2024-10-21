//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();
        bmw.setModelo("BMW");
        bmw.setMarca("BMW");
        bmw.setColor("Celeste");
        bmw.setCilindraje(123);
        System.out.println("bmw.getMarca() = " + bmw.getMarca());
        System.out.println("bmw.getModelo() = " + bmw.getModelo());
        System.out.println("bmw.getColor() = " + bmw.getColor());
        System.out.println("bmw.getCilindraje() = " + bmw.getCilindraje());

        /*System.out.println("bmw.verDetalle() = " + bmw.verDetalle());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar(80) = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTanque(40, 0.7f) = " + bmw.capacidadTanque(40, 0.7f));*/
    }
}