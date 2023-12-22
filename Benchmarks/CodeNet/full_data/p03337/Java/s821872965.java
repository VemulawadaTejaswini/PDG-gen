import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num[] = {a + b, a - b, a * b};
        Arrays.sort(num);
        System.out.println(num[2]);
        
    }
}
