
package rmi1;


import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        System.out.println("Iniciando servidor");
        Remote ObjCliente1 = UnicastRemoteObject.exportObject(new TestRemote() 
        {
            @Override
            public String mensajeSaludo(String name) throws RemoteException {
                String mensaje= "Hola "+name+" BIENVENIDO, su codigo es 9900373189";
                CifradoDatos cifradoDatos = new CifradoDatos(mensaje);
                return cifradoDatos.Cifrado();
            } 
            public int getData2(int[]arr) throws RemoteException{
                int sum=0;
                for(int i=0;i<80;i++){
                  sum=sum+arr[i];  
                }
                
                return sum;
            }
           
          
        }, 0);
        Registry registry = LocateRegistry.createRegistry(1099);
        
        registry.bind("datoKey", ObjCliente1);
        
        
        
    }
}