import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;
        long B;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
        }
        for(int i = 0;i < 1010;i++){
            if(Math.floor((double)i * (double)0.08 )== A && Math.floor((double)i * (double)0.1 )==B){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        return;
    }
}
