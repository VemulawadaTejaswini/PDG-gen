import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        for (int i = 1, count = 0; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) count++;
            if (count == k) {
                System.out.println(i);
                break;
            }
        }
    }
}
