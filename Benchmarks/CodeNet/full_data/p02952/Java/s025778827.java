import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        long N;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextLong();
        }
        long result = 0;
        for (int i = 1; i <= N; i++) {
            String str = i + "";
            if(str.length() % 2 ==1){
                result++;
            }
        }
        System.out.println(result);
        return;
    }
}
