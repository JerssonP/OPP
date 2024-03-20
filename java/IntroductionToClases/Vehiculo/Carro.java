package carro;

public class Carro {
  int Año;
  String Marca;
  int Cilindraje;
  int Precio;

  public Carro(int year, String name, int cc) {
    Año = year; 
    Marca = name;
    Cilindraje = cc;
  }
  
  public int actualizarPrecio(int prize){
      Precio = prize;
      return Precio;
  }
  
  public static void main(String[] args) {
    Carro myCar = new Carro(1969, "Mustang", 150);
    System.out.println(myCar.Año + " " + myCar.Marca + " " + myCar.Cilindraje +" " + myCar.Precio);
    System.out.println("Nuevo precio: " + myCar.actualizarPrecio(3000));
  }
}