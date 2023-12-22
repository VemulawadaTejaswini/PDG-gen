import java.util.*;
 
public class Main {
    static long ans = 0;
    static int m;
    static long [][] xyz;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        xyz = new long [n][3];
        for(int i = 0; i < n; i++) {
            xyz[i][0] = sc.nextLong();
            xyz[i][1] = sc.nextLong();
            xyz[i][2] = sc.nextLong();
        }
        function(0,0,0,0,0);
        System.out.println(ans);
    }
    
    static private void function(long sumX, long sumY, long sumZ, int num, int index) {
        if(num == m) {
            long sum = absolute(sumX) + absolute(sumY) + absolute(sumZ);
            ans = Math.max(ans,sum);
        } else {
            for(int i = index; i < xyz.length; i++) {
                function(sumX+xyz[i][0], sumY+xyz[i][1], sumZ+xyz[i][2], num+1, i+1);
            }
        }
    }
    
    static private long absolute(long num) {
        return Math.abs(num);
    }
}