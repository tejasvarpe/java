import java.rmi.*;

public class RmiClient {
    public static void main(String args[]) throws Exception {
        try {
            String s1 = "rmi://localhost/palin";
            One onex = (One)Naming.lookup(s1);
            int m = onex.palin("madam");
            System.out.println("Print : " + m);
            if (m == 1) {
                System.out.println("The given string is a Palindrome");
            }
            else {
                System.out.println("The given string is not a Palindrome");
            }
        }
        catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
}   