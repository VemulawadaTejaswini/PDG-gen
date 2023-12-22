import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        stdIn.close();

        String s = "";
        int Count = 0;

        for (int i = 0; i < Math.pow(10, 2); i++) {
            for(int j = 0; j < A; j++) {
                s += "b";
            }
    
            for(int j = 0; j < B; j++) {
                s += "r";
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'b') {
                Count++;
            }
        }
        System.out.println(Count);
    }
}