import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        int sum = 1;
        while(sum < b) {
            sum += a - 1;
            count++;
        }
        
        System.out.println(count);
    }
}
