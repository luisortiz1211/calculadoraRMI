/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcPackage;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luchi
 */
public class Cliente {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try
    {
        Registry conexion = LocateRegistry.getRegistry("localhost",1099);
        CalculadoraRMI c = (CalculadoraRMI)Naming.lookup("//localhost/CalculadoraRMI");
        
    while(true){
        
    String menu = JOptionPane.showInputDialog(
        "Funciones de una calculadora\n"
                +"Suma_____________1\n"
                +"Resta_____________2\n"
                +"Multiplicacion_______3\n"
                +"Division____________4\n"
                +"Exponente_________5\n"
                +"Cancelar para Salir");
    
                switch(menu){
                   case "1":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       JOptionPane.showMessageDialog(null, "Resultado de la suma :"+ c.suma(x,y));
                       break;                     
                   }
                   case "2":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       JOptionPane.showMessageDialog(null, "Resultado de la resta :"+ c.resta(x,y));
                       break;
                   }
                   case "3":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion :"+ c.multiplicacion(x,y));
                       break;
                   }
                   case "4":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       JOptionPane.showMessageDialog(null, "Resultado de la division :"+ c.division(x,y));
                       break;
                   }  
                   case "5":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero base"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
                       JOptionPane.showMessageDialog(null, "Resultado de exponentes :"+ c.exponente(x,y));
                       break;
                   }  
                           }
        
    }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Servidor no Conectado"+e);
    }
    }
}


    