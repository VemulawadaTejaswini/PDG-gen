import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt();
        int a[] = new int[n];
        int sum, count;

        sum = 0;
        for(int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        
        count = 0;
        for(int i = 0; i < n; i++) {
            if(!(a[i] < sum / (double)(4 * m))) {
                count++;
            }

            if(count == m) {
                System.out.println("Yes");
                scan.close();
                return;
            }
        }
        System.out.println("No");

        scan.close();
        return;
    }
}