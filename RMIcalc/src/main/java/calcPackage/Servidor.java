/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcPackage;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author luchi
 */
public class Servidor {
    public static void main(String[] args){
    try{
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
        r.rebind("CalculadoraRMI", new RMI());
        JOptionPane.showMessageDialog(null,"Servidor Conectado");
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Fallo conexión con el servidor" +e);
    }
    }
}
