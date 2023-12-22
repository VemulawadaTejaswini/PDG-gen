import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
    
        boolean isOdd = (n & 1) == 1;
        int num = 0;
        for(int i = 0; i < n; i++) {
            num = sc.nextInt();
            if(num < 0 || num >= n) {
                System.out.println(0);
                return;
            }
            
            if(isOdd && ((num & 1) == 1)) {
                System.out.println(0);
                return;
            } else if(!isOdd && ((num & 1) == 0)) {
                System.out.println(0);
                return;
            }
            
            times[num]++;
            if(times[num] > 2 || times[0] == 2) {
                System.out.println(0);
                return;
            }
        }
    
        
        System.out.println((int)(Math.pow(2, n / 2) % 1000000007));
    }
}
