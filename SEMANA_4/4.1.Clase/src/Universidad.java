import javax.swing.*;

public class Universidad {
    static String nombNS = "            Universidad de las Américas";
    static String nombCS = "UDLA";
    static String dir = "Vía Nayón";
    static String telf = "(02) 398-1000";

    public Universidad() {
    }

    public String EncabezadoU() {
        String inf = "\t\t\t" + nombNS + "\nDireccion: " + dir + "\t\t\tTeléfono: " + telf + "\nBienvenido, ingresar la cantidad de estudiantes a registrar:";
        return JOptionPane.showInputDialog(inf);
    }
}
