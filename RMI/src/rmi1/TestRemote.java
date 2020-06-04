/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1;

/**
 *
 * @author Marlon Julian
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface TestRemote extends Remote {
    
    String mensajeSaludo(String name) throws RemoteException;
    public int getData2(int[] arr)throws RemoteException;
       
}
