import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                long n = sc.nextLong();
                long k = sc.nextLong();
                sc.close();
                if(n == 1 && k == 1){
                        System.out.println(1);
                }else{
                        System.out.println((long)(k * Math.pow(k - 1 , n - 1)));
                }
        }
}