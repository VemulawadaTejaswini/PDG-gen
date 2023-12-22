import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(c%gcd(a,b)==0)System.out.println("YES");
        else System.out.println("NO");
    }
    public static int gcd(int a,int b){
        int max = 1;
        for(int i = 1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0)if(i>max)max=i;
        }
        return max;
    }
}