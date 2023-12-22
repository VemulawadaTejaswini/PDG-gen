import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        stdIn.close();
        
        if (N / 100 == 7) {
            System.out.println("Yes");
        } else if ((N % 100) / 10 == 7) {
            System.out.println("Yes");
        } else if (N % 10 == 7) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}