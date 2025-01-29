import java.rmi.Naming;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Hello stub = (Hello) Naming.lookup("//xxxxxx/HelloService");  // Altere "xxxxxx" pelo endereço IPV4 de sua máquina
            System.out.println(stub.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
