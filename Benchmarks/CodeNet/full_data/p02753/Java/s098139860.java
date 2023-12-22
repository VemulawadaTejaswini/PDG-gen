import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a+b<n){
            System.out.println(a);
        }else{
        System.out.println(n-b);
        }
        
    }
}
