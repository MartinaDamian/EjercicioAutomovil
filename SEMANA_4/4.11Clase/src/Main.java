import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Automovil bmw = new Automovil("BMW", "BMW", "Celeste", 12);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String marca = JOptionPane.showInputDialog("Marca: ");
        JOptionPane.showMessageDialog(null, marca);
        /*bmw.setModelo("BMW");
        bmw.setMarca("BMW");
        bmw.setColor("Celeste");
        bmw.setCilindraje(123);*/

        String var1;
        System.out.println("Modelo: ");
        var1 = br.readLine();
        System.out.println("");
        bmw.setModelo(var1);
        System.out.println("bmw.getModelo = " + var1);

        int var2;
        System.out.println("Cilindraje: ");
        var2=Integer.parseInt(br.readLine());
        bmw.setCilindraje(var2); //Realmente deberia ir String.valueOf
        System.out.println("Cilindraje = " + var2);

        String var3;
        System.out.println("Color: ");
        var3 = br.readLine();
        bmw.setColor(var3);
        JOptionPane.showMessageDialog(null, "El color es: " + var3);
        System.out.println("bmw.getMarca() = " + bmw.getMarca());

        System.out.println("bmw.verDetalle() = " + bmw.verDetalle());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar(80) = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTanque(40, 0.7f) = " + bmw.capacidadTanque(40, 0.7f));
    }
}