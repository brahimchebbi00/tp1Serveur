import java.io.*;
import java.net.Socket;

public class ClientSock extends Thread {
    private Socket socket;

    public ClientSock(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {


        try {

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            System.out.println("J�attends une chaine");
            String str = br.readLine();

            String rep = "Bonjour Mr" + str;

            System.out.println("J�envoies la r�ponse"+rep);
            pw.println(rep);
            socket.close();
        }
    	catch(Exception e)
    {
        e.printStackTrace();
    }

}
    }

