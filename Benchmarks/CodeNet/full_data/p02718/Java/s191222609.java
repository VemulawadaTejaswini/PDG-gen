import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        Integer[] a = new Integer[n];
        long sum = 0;
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
            sum += a[i];
        }

        Arrays.sort(a, Collections.reverseOrder());

        if(a[m-1] * (4 * m) >= sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}