import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Universidad udla = new Universidad();
        int num = Integer.parseInt(udla.EncabezadoU());
        JOptionPane.showMessageDialog(null, num);
        for (int i = 0; i < num; i++) {

        Estudiante alum = new Estudiante();


        }
    }
}