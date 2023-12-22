import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        if(B-A<=2){
            System.out.println(1+K);
            return;
        }

        long exchange = Math.max((K-A+1)/2,0);
        long hit = K-exchange*2;

        System.out.println(1 + hit + exchange*(B-A));




    }
}
