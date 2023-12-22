import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while(n / k != 0){
            count++;
            n /= k;
        }
        System.out.println(count +1);
    }
}
