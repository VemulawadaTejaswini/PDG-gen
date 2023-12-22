import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        String ans = "";
        while(n!=0)
        {
            long digit = n%k;
            ans += String.valueOf(digit);
            n/=k;
        }
        System.out.println(ans.length());
    }
}
