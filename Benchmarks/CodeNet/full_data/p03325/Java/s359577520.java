import java.util.*;
public class Main {
    public static int howManyTwos(int a) {
        int res = 0;
        while (a % 2 == 0) {
            a /= 2;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int twos = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            twos += howManyTwos(a);
        }
        System.out.println(twos);
    }
}