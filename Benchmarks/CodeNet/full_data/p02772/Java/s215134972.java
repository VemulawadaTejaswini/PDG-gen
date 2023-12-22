import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String ans = "APPROVED";
        int tmp;
        for (int i = 0; i < N; i++) {
             tmp = sc.nextInt();
             if(tmp % 2 == 0){
                 if(tmp % 3 != 0 && tmp % 5 != 0){
                     ans = "DENIED";
                 }
             }
        }

        System.out.println(ans);

    }
}