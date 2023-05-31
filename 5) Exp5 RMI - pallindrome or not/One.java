import java.rmi.*;

interface One extends Remote {
    public int palin(String a) throws RemoteException;
}