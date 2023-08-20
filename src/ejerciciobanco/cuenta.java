/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobanco;

/**
 *
 * @author CesarLopez
 */
public class cuenta {
String nombre;
String apellido;
int saldo;

    public cuenta(String nombre, String apellido, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }

public void debitar(int debito){
 this.saldo -= debito;
 
}
public void abonar(int abono){
this.saldo +=abono;
}
public void mostrar(){
    System.out.println("Nombre: "+this.nombre);
     System.out.println("Apellido: "+this.apellido);
      System.out.println("Saldo: "+this.saldo);
}
}
