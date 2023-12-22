import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        int count = 0;
        for (int i=1; i<=len; i++) {
            if (i % 2 == 1 && i == len) {
                count += n - Math.pow(10, i-1) + 1;
            } else if (i % 2 == 1) {
                count += 9 * Math.pow(10, i-1);
            }
        }
        System.out.print(count);
    }
}