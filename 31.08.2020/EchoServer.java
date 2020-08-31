import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("Сервер запущен!!! Ждём клиентов");
            socket = serverSocket.accept();
            System.out.println("Подключен клиент");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            String line;
            while ((line = in.readLine())!= null){
                if (line.equals("end")){
                    break;
                }
                System.out.println(line);
                out.writeUTF(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
