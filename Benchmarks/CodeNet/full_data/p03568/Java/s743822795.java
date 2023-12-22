import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = (int)Math.pow(3,n);
        int odds = 1;
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            odds *= tmp % 2 == 0 ? 2 : 1;
        }
        System.out.println(total-odds);
    }
}
