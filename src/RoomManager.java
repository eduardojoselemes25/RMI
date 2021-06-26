import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RoomManager extends Remote {
    String listar() throws RemoteException;
    String reservar(int typeRoom, String nameGuests) throws RemoteException;
    String hospedes() throws RemoteException;
}
