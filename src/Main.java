import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hoteles[] hotel=new Hoteles[5];
        Scanner leer=new Scanner(System.in);

        for(int i=1;i<=3;i++){
            System.out.println("ingresar nombre del hotel");
            String nombre=leer.nextLine();
           hotel[i]=new Hoteles(nombre);
           hotel[i].mostrarInfo();
        }
    }
}