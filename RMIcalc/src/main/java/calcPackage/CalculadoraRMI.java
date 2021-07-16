/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcPackage;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author luchi
 */
public interface CalculadoraRMI extends Remote {
    
    public double division(double a, double b)throws RemoteException;
    public double multiplicacion(double a, double b)throws RemoteException;
    public double suma(double a, double b)throws RemoteException;
    public double resta(double a, double b)throws RemoteException;
    public int exponente(int a, int b) throws RemoteException;
       
}
