import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int two = 1;
        while (two * 2<= n) {
            two *= 2;
        }
        System.out.println(two);
    }
}