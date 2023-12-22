import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long a = n + 1;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                a = Math.min(i + n / i , a);
            }
        }
        System.out.println(a - 2);
    }
}