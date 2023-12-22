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

        long A;
        long B;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
        }
        long K = 0;
        if(Math.abs(A - B ) %2 ==1 ){
            System.out.println("IMPOSSIBLE");
            return;
        }
        if(A > B){
            K = A - ((A - B) / 2);
        }else{
            K = B - ((B - A) /2);
        }
        System.out.println(K);
        return;
    }
}