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
            Naming.rebind("//xxxxxx/HelloService", server); // Altere "xxxxxx" pelo endereço IPV4 de sua máquina
            System.out.println("Servidor RMI pronto...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
