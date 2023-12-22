import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();
        long a=y/x;
        
        int ans=0;
        for(;a>=1;){
            a=a/2;
            ans++;
        }
        System.out.println(ans);
    }
}
