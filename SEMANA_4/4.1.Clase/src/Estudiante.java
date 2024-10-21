import javax.swing.*;

public class Estudiante {
    private String nombre;
    private String ID;
    private String materia;
    private int num;
    public Estudiante() {}
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, String ID) {
        this(nombre);
        this.ID = ID;
    }

    public Estudiante(String nombre, String ID, String materia) {
        this(nombre, ID);
        this.materia = materia;
    }

    public Estudiante(String nombre, String ID, String materia, int num) {
        this(nombre,ID, materia);
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
