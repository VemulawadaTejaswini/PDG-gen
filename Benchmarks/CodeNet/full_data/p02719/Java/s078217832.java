import java.util.Scanner;

public class Main{ public static void main(String...args){
        Scanner sc = new Scanner(System.in); long N = sc.nextLong(); long K = sc.nextLong(); long res = N % K;
        System.out.println(Math.min(res, K - res));     }
}