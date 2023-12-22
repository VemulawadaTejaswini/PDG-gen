import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        Zeb[] arr = new Zeb[x];
        int[] dp = new int[x];
        for(int i = 0; i <  x; i++) arr[i] = new Zeb(scan.nextInt(), scan.nextInt());
        Arrays.sort(arr);
        //for(Zeb i : arr) System.out.println(i.a + " " + i.b);
        dp[0] = 1;
        int curr = arr[0].b;
        for(int i = 1; i < x; i++) {
            if(curr <= arr[i].a) {
                curr += arr[i].b;
                dp[i] = dp[i-1] + 1;
            }
            else {
                dp[i] = dp[i-1];
            }
        }
        System.out.println(dp[x-1]);
    }
    
    static class Zeb implements Comparable<Zeb>{
        int a;
        int b;
        
        public Zeb(int x, int y) {
            a = x;
            b = y;
        }
        
        public int compareTo(Zeb other) {
            return (this.b == other.b) ? this.a - other.a : this.b - other.b;
        }
        
    }
}
