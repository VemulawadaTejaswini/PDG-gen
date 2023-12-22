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

        long K;
        long X;

        try (Scanner sc = new Scanner(System.in)) {
            K = sc.nextLong();
            X = sc.nextLong();
        }
        StringBuilder sb = new StringBuilder();

        for(int i = -1000000;i < 1000001;i++){
            if( i <= X &&i + (K-1) >= X ){
                sb.append(i).append(" ");
            }else if(i >= X && i -(K-1) <= X){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString());
        return;

    }
}
