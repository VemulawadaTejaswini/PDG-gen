import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n));
    }
    public static int ans(int n) {
        if(n%2 == 0) {
            System.out.println(n);
        }
        else {
            System.out.println(n*2);
        }
    }
}