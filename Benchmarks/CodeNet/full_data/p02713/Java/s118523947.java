import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K =Integer.parseInt(sc.next());
        int gcd1,gcd2 ;
        long sum = 0;
        for(int i=1;i<=K;i++){
            for(int j=1;j<=K;j++){
                for(int k=1;k<=K;k++){
                    gcd1 = gcd(j,i);
                    gcd2 = gcd(k,gcd1);
                    sum+=gcd2;
                }
            }
        }
        System.out.println(sum);
    }

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}