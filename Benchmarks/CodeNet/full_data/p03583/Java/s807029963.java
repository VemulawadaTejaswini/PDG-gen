import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        OUT:for (long i = 1; i <= 3500; i++) {
            for (long j = 1; j <= 3500; j++) {
                long k = Math.round((double)(n*i*j)/(double)(4*i*j-n*i-n*j));
                if(k>0&&4*i*j*k==n*(i*j+j*k+k*i)){
                    System.out.printf("%d %d %d",i,j,k);
                    break OUT;
                }
            }
        }
        sc.close();
    }
}