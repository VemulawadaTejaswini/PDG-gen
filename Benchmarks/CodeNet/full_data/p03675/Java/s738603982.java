// AtCoder Regular Contest 077 C - pushpush
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] values = new int[n];
        for(int i = 0; i < n; i++){
            values[i] = scan.nextInt();
        }

        int nHalf = n / 2;
        int odd = n % 2;

        if(n != 1){
            for(int i = 0; i < nHalf + odd; i++){
                System.out.print(values[n - 1 - i*2] + " ");
            }

            for(int i = 0; i < nHalf - 1; i++){
                System.out.print(values[odd + i*2] + " ");
            }

            System.out.println(values[n - 2]);
        }else{
            System.out.println(values[0]);
        }
    }
}
