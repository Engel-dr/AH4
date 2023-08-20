
package ejerciciobanco;

import java.util.Scanner;

public class menu {
public static void ejecutar(){
Scanner sp = new  Scanner(System.in);
cuenta ob1 = new cuenta("Pedro", "Donis", 500);
cuenta ob2 = new cuenta("Sandra", "Lopez", 500);
    while (true) {        
        System.out.println("***********************");
        System.out.println("** 1. Mostrar cuenta **");
        System.out.println("** 2. Abonar cuenta  **");
        System.out.println("** 3. Debitar cuenta **");
        System.out.println("** 4. Salir ***********");
        System.out.println("***********************");
        int opcion = sp.nextInt();
        
        switch (opcion){
        
            case 1:
               System.out.println("Ingrese la cuenta 1 o cuenta 2");
                int valor = sp.nextInt(); 
                if (valor == 1) {     
                ob1.mostrar();
                } else { 
                ob2.mostrar();
                }
                break;        
             case 2:
                 System.out.println("Ingrese la cuenta 1 o cuenta 2");
                 valor = sp.nextInt();
               System.out.println("ingrese el valor a abonar"); 
                if (valor == 1) {     
                ob1.abonar(sp.nextInt());
                } else { 
                ob2.abonar(sp.nextInt());
                }
                
                break;
            case 3:
                 System.out.println("Ingrese la cuenta 1 o cuenta 2");
                 valor = sp.nextInt();
                 System.out.println("ingrese el valor a debitar");
                 if (valor == 1) {
                 ob1.debitar(sp.nextInt());
                 }else {
                 ob2.debitar(sp.nextInt());
                 }
         
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
public static void main (String[] args){
menu.ejecutar();
}
}
