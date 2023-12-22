import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = 1;
        long mod = (int)Math.pow(10,9) + 7;

        for(int i=1; i<=n; i++){
            p *= i;
            p = p%mod;
        }
        System.out.println(p);
    }
}