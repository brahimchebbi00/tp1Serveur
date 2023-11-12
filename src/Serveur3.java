import java.net.*;
import java.io.*;

public class Serveur3 {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(1234);

            while(true){
                System.out.println("J�attends une connexion");
                Socket s = ss.accept();
                InputStream is=s.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                OutputStream os=s.getOutputStream();
                PrintWriter pw = new PrintWriter(os,true);
                System.out.println("J�attends une chaine");
                String str=br.readLine(); //int nb=is.read();
                String rep="Bonjour Mr"+str;
                System.out.println("J�envoies la r�ponse");
                pw.println(rep); //os.write(res);
                s.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }

}
