import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int [] a = new int [n];

        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        int maxGcd = 1;
        int [] tempGcdArr = new int [n];
        int gcd;

        for(int i=n-1; i>=0; i--){
            if(i == n-1){
                gcd = a[0];
                for(int j=0; j<n; j++){
                    if(j != i){
                        gcd = gcd(gcd, a[j]);
                    }
                    tempGcdArr[j] = gcd;
                }
            }else{
                if(i == 0){
                    gcd = a[1];
                }else{
                    gcd = tempGcdArr[i-1];
                }
                for(int j=i+1; j<n; j++){
                    gcd = gcd(gcd, a[j]);
                }
            }
            if(maxGcd<gcd){
                maxGcd = gcd;
            }
        }

        System.out.println(maxGcd);
    }

    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
