import java.rmi.*;

public class RmiServer {
    public static void main(String args[]) throws Exception {
        try {
            Two twox = new Two();
            Naming.bind("palin", twox);
            System.out.println("Object registered");
        }
        catch(Exception e) {
            System.out.println("Exception" + e);
        }
    }
}