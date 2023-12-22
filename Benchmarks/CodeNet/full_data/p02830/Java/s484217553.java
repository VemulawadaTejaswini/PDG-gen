
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        String S;
        String T;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();
            T = sc.next();

        }
        
        char[] sc = S.toCharArray();
        char[] tc = T.toCharArray();
        char[] result = new char[N*2];
        
        for (int i = 0; i < N; i++) {
            result[2*i] = sc[i];
            result[2*i +1] = tc[i];
        }
        
        
        System.out.println(new String(result));
        

    }


}
