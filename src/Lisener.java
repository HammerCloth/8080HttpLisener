import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:syx
 * @date:2021/8/22 10:11
 * @version:v1.0
 */
public class Lisener {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        while(true){
            System.out.println("开始监听8080端口");
            Socket accept = socket.accept();
            InputStream inputStream = accept.getInputStream();
            byte[] b = new byte[1000];
            int read = inputStream.read(b);
            String s = new String(b);
            System.out.println(s);
        }

    }
}
