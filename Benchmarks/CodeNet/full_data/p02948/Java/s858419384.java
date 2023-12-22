import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        //int[] a = new int[n];
        //int[] b = new int[n];
        int[][] ab = new int[n][2];

        for(int i = 0;i < n;i++){
            ab[i][1] = stdIn.nextInt();
            ab[i][0] = stdIn.nextInt();
        }

        Arrays.sort(ab, (b, a) -> Integer.compare(a[0], b[0]));


        long result = 0L;

        for(int i = 1;i <= m;i++) {
            for(int j = 0;j < n;j++) {
                if(ab[j][1] <= i) {
                    result += ab[j][0];
                    ab[j][1] = 10000000;
                    break;
                }
            }
        }
        System.out.println(result);
    }

}