import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());
        if (N == 0l){
            System.out.println(K);
        }else{
            System.out.println((long)Math.pow(100l, N)*K);
        }
   }
}