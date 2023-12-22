import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int num[] = new int[n];
        for(int i = 0; i < n;i++)
            num[i] = scan.nextInt();

        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += num[i];
        }
      
        int cnt = 0;
        for (int i=0; i<n; i++) {
           if (num[i]*4*m >= sum) {
                cnt++;  
            }
        }
        if (cnt >= m) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
}