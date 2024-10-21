public class Veterinaria {
    public Veterinaria() {
    }

    public static void main(String[] args) {
        Animales pr = new Animales();
        System.out.println("Informacion del perro es:");
        pr.raza = "Pastor Aleman";
        pr.edad = "5";
        pr.peso = 10;
        pr.sexo = "Hembra";
        System.out.println(pr.detalleanimal());
        System.out.println("\nInformacion del gato es:");
        Animales gt = new Animales();
        gt.raza = "Siames";
        gt.edad = "15";
        gt.peso = 8;
        gt.sexo = "Macho";
        System.out.println(gt.detalleanimal());
        System.out.println("\nInformacion del caballo es:");
        Animales cll = new Animales();
        cll.raza = "Frizon";
        cll.edad = "3";
        cll.peso = 35;
        cll.sexo = "Macho";
        System.out.println(cll.detalleanimal());
        System.out.println("\nInformacion de vaca es:");
        Animales vc = new Animales();
        vc.raza = "Holstein";
        vc.edad = "6 años";
        vc.peso = 40;
        vc.sexo = "Hembra";
        System.out.println(vc.detalleanimal());
    }
}
