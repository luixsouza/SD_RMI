import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements Hello {
    
    protected HelloServer() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Olá, cliente! Conexão RMI bem-sucedida!";
    }

    public static void main(String[] args) {
        try {
            HelloServer server = new HelloServer();
            Naming.rebind("//192.168.1.115/HelloService", server);
            System.out.println("Servidor RMI pronto...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
