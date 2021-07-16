/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcPackage;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
 
 /*
 * @author luchi
 */
public class RMI extends UnicastRemoteObject implements CalculadoraRMI 
{
    public RMI() throws RemoteException{
    int a,b ;
    }
    public double suma(double a, double b )throws RemoteException{
        return a+b;
    }
    public double resta(double a, double b )throws RemoteException{
        return a-b;
    }
    public double multiplicacion(double a, double b)throws RemoteException{
        return a*b;
    }
    public double division(double a, double b)throws RemoteException{
        return a/b;
    }
    public int exponente(int a, int b) throws RemoteException{
        return (int)Math.pow(a,b);
    }       
}
