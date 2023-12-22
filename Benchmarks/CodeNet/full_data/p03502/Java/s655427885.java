import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = n;

        while(a > 0){
            sum += a % 10;
            a = a / 10;
        }
        
        System.out.println(n % sum == 0 ? "Yes" : "No");
    }
}
