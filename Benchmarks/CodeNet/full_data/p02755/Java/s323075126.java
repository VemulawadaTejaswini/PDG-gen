import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        stdIn.close();

        int result = 0;
        for (int i = 13; i <= 1000; i++) {
            if (((int)Math.floor(i * 0.08) == A) && ((int)Math.floor(i * 0.1) == B)) {
                System.out.println(i);
                result = 1;
                break;
            }
        }   
        if (result == 0) {
            System.out.println(-1);
        }
    }
}