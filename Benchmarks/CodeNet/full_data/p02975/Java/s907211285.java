import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextLong();
        }

        Arrays.sort(ar);
        
        if(ar[0] == ar[n/3-1] && ar[n/3] == ar[2*n/3-1] && ar[2*n/3] == ar[n-1] && (ar[0]^ar[n/3]^ar[n-1])==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
