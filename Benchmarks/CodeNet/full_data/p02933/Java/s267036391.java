import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        final String S = scan.next();
        scan.close();
        
        if (A < 3200) {
            System.out.println("red");
        } else {
            System.out.println(S);
        }

    }

}
