import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = Integer.parseInt(sc.next());

        long gcd = 0;
        for(int i=0;i<n;i++){
            gcd = getGCD(a[i], gcd);
        }
        System.out.println(gcd);
        sc.close();

    }

    public static long getGCD(long a,long b){
        if(b==0){
            return a;
        }else{
            return getGCD(b,a%b);
        }
    }
    
}