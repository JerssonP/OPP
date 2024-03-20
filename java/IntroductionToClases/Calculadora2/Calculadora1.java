/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora1;

public class Calculadora1 {
  int x;
  int y;
  float r;

  public Calculadora1 (int a, int b, int c){
    x=a;
    y=b;
    r=c;
  }

  public float sumar (int a, int b){
    x=a;
    y=b;
    r=x+y;
    return r;
  }

  public float restar (int a, int b){
    x=a;
    y=b;
    r=x-y;
    return r;
  }
  public float multiplicar (int a, int b){
    x=a;
    y=b;
    r=x*y;
    return r;
  }
    public float dividir (int a, int b){
    x=a;
    y=b;
    r= x/y;
    return r;
  }
    public float potenciacion (int a){
    x=a;
    r= x*x;   
    return r;
  }
  public void imprimirResultado() {
    System.out.println("El resultado de la operacion es: " + r);
  } 
  
  public static void main(String[] args) {
    Calculadora1 obj1 = new Calculadora1(0,0,0);
    obj1.sumar(11,19);
    obj1.imprimirResultado();
    obj1.restar(11,19);
    obj1.imprimirResultado();
    obj1.multiplicar(11,19);
    obj1.imprimirResultado();
    obj1.dividir(11,19);
    obj1.imprimirResultado();
    obj1.potenciacion(5);
    obj1.imprimirResultado();    
  }
}