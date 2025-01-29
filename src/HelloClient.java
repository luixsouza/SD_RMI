import java.rmi.Naming;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Hello stub = (Hello) Naming.lookup("//192.168.1.115/Hello");
            System.out.println(stub.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
