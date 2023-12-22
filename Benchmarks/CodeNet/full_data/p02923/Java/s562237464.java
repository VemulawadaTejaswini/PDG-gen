
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());

        int[] h = new int[n];
        for(int i =0; i < n; i++) {
            h[i] = Integer.parseInt(scanner.next());
        }

        int count = 0;
        int max = 0;
        for(int i = 0; i < n -1; i++) {
            if(h[i] >= h[i+1]) {
                count +=  1;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        max = Math.max(max, count);
        System.out.println(max);
    }
}
