import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);

            int x = n / 2;
            int y = n % 2;
            int sum = 0;
            if(y == 0){
                sum = sum + a[x] - a[x - 1];
                for (int i = 0; i < (x - 1); i++) {
                    sum = sum + a[n - 1 - i] * 2 - a[i] * 2;
                }
                System.out.println(sum);
            }else{
                for (int i = 0; i < x; i++) {
                    sum = sum + a[n - 1 - i] * 2 - a[i] * 2;
                }
                sum = sum - a[x] + a[x - 1];
                System.out.println(sum);
            }
        }
    }
}