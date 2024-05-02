import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {
    }

    public static void main(String[] args) {
        try {

            Registry registry = LocateRegistry.getRegistry(null);

            Adder stub = (Adder) registry.lookup("Hello");

            int result = stub.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            System.out.println("Result From Server: " + result);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
} 
