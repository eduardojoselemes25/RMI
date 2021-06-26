import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class RoomManagerImpl extends UnicastRemoteObject implements RoomManager {

    private List<Room> listQuart = new ArrayList<>();
    private List<String> reserva = new ArrayList<>();

    RoomManagerImpl() throws RemoteException {
        super();
        listQuart.add(new Room(10, 0, "quartos individuais", 55));
        listQuart.add(new Room(20, 1, "quartos duplos", 75));
        listQuart.add(new Room(5, 2, "quartos duplos", 80));
        listQuart.add(new Room(3, 3, "quartos triplos", 150));
        listQuart.add(new Room(2, 4, "quartos quádruplos", 230));
    }

    public String listar() throws RemoteException {
        StringBuilder list = new StringBuilder();
        for (Room room : listQuart) list.append(room.toString()).append("\n");
        return list.toString();
    }

    public String hospedes() throws RemoteException {
        StringBuilder list = new StringBuilder();
        for (String guest : reserva) list.append(guest).append("\n");
        return list.toString();
    }

    public String reservar(int typeRoom, String nomeHospede) throws RemoteException {
        for (Room room : listQuart) {
            if (typeRoom == 0 && room.getTipo() == typeRoom) {
                if (room.getQuantDisp() == 0) {
                    return "Não temos mais quartos disponíveis " + typeRoom;
                } else {
                    room.setQuantDisp(room.getQuantDisp()-1);
                    reserva.add(nomeHospede);
                    return "Tipo: " + typeRoom + " Hospede: " + nomeHospede;
                }
            }

            if (typeRoom == 1 && room.getTipo() == typeRoom) {
                if (room.getQuantDisp() == 0) {
                    return "Não temos mais quartos disponíveis" + typeRoom;
                } else {
                    room.setQuantDisp(room.getQuantDisp()-1);
                    reserva.add(nomeHospede);
                    return "Tipo: " + typeRoom + " Hospede: " + nomeHospede;
                }
            }

            if (typeRoom == 2 && room.getTipo() == typeRoom) {
                if (room.getQuantDisp() == 0) {
                    return "Não temos mais quartos disponíveis " + typeRoom;
                } else {
                    room.setQuantDisp(room.getQuantDisp()-1);
                    reserva.add(nomeHospede);
                    return "Tipo: " + typeRoom + " Hospede: " + nomeHospede;
                }
            }

            if (typeRoom == 3 && room.getTipo() == typeRoom) {
                if (room.getQuantDisp() == 0) {
                    return "Não temos mais quartos disponíveis " + typeRoom;
                } else {
                    room.setQuantDisp(room.getQuantDisp()-1);
                    reserva.add(nomeHospede);
                    return "Tipo: " + typeRoom + " Hospede: " + nomeHospede;
                }
            }

            if (typeRoom == 4 && room.getTipo() == typeRoom) {
                if (room.getQuantDisp() == 0) {
                    return "Não temos mais quartos disponíveis " + typeRoom;
                } else {
                    room.setQuantDisp(room.getQuantDisp()-1);
                    reserva.add(nomeHospede);
                    return "Tipo: " + typeRoom + " Hospede: " + nomeHospede;
                }
            }
        }
        return "Falha ao criar reserva!!";
    }
}
