import java.net.*;

public class Serveur4 {



    public static void main(String[] args){

        try {

            ServerSocket ss = new ServerSocket(123);
            while(true){

                System.out.println("J�attends une connexion");
                Socket s = ss.accept();
                ClientSock clientSock=new ClientSock(s);
                clientSock.start();
            }
        }	catch (Exception e){
            e.printStackTrace();
        }
    }
}
