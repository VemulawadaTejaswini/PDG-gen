import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;

        while(i < k) {
            while(a > 0) {
                a--;
                i++;
            }
            b--;
            i++;
        }

        System.out.println(a + "" + b);
    }
}
