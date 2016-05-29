/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Repositorio remoto: github.com/jmcslp/tareaUT5

package dam_ed04_actividad;


public class Main {

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;
        
        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
    public static void main(String[] args) {
        CCuenta cuenta1;
    
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        operativa_cuenta(cuenta1,2300);
   
    }
}
