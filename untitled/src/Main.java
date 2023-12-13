import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {
    public static void main(String[] args)  {

        try {
            DatagramSocket datagramSocket = new DatagramSocket(8666);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}