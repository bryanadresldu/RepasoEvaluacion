package repaso1;

public class Main {
    public static void main(String[] args) {
        //creacion de 5 instancias de la clase (con valores quemados)
        Hoteles hotel1=new Hoteles("El dorado","Quito",25.4);
        Hoteles hotel2=new Hoteles("Quito","Quito",30.4);
        Hoteles hotel3=new Hoteles("El Prado","Ibarra",35);
        Hoteles hotel4=new Hoteles("Ramada","Guayaquil",45.5);
        Hoteles hotel5=new Hoteles("Marques","Esmeraldas",50.4);

        //creecion de dos objetos con valores nulos
        Hoteles hotel6=new Hoteles();
        Hoteles hotel7=new Hoteles();
        hotel6.mostrarInfo();
        hotel7.mostrarInfo();

        //seteo de los sus valores de dos objetos con valores nulos
        hotel6.nombre="Cristal";
        hotel6.ciudad="Manta";
        hotel6.precio=34.5;

        hotel7.nombre="Oro Mar";
        hotel7.ciudad="Salinas";
        hotel7.precio=80;

        hotel6.mostrarInfo();
        hotel7.mostrarInfo();

        // Impresion de todos los objetos

        System.out.println("\n-------------- Lista de Hoteles --------------");
        Hoteles[] hoteles = { hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7 };
        for (int i=0;i<7;i++) {
            hoteles[i].mostrarInfo();
        }

        //creecion de tres objetos con valores nulos
        Hoteles hotel8=new Hoteles();
        Hoteles hotel9=new Hoteles();
        Hoteles hotel10=new Hoteles();
        //Usando metodo modificar
        //Se modifica todos los atributos de los tres objetos con el valor de NULL

        hotel8.modificar("San Luis","Portoviejo",24.5);
        hotel9.modificar("Chagra","Riobamba",34.5);
        hotel10.modificar("La Paz","Tulcan",44.5);

        System.out.println("\n------ Lista de Hoteles con valor NUll modificadas--------------");
        hotel8.mostrarInfo();
        hotel9.mostrarInfo();
        hotel10.mostrarInfo();

    }
}
