import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] min = new long[n];
        
        int count = 1;
        min[0] = sc.nextLong();
        for(int i = 1;i < n;i++) {
            long p = sc.nextLong();
            if(p <= min[i - 1]) {
                min[i] = p;
                count++;
            }
            else {
                min[i] = min[i - 1];
            }
        }
    
        System.out.println(count);
    }
}
