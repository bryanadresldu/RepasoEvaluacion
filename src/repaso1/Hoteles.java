package repaso1;
public class Hoteles {
    //Atributos
    String nombre;
    String ciudad;
    double precio;

    public Hoteles() {
    }
    //  Constructor
    public Hoteles(String nombre, String ciudad, double precio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.precio = precio;
    }
    // Metodo para modificar los objetos previamente creados
    public void modificar(String nuevoNombre, String nuevaCiudad, double nuevoPrecio){
        nombre = nuevoNombre;
        ciudad = nuevaCiudad;
       precio = nuevoPrecio;
    }

    //Metodo para imprimir todos los objetos
    public void mostrarInfo(){
        System.out.println("----La informacion del hotel es:  ----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Precio: "+precio);
    }
}
