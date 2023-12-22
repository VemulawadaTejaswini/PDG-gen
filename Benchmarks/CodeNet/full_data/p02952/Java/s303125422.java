import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        int size = str.length();
        if (size == 1) {
            System.out.println(n);
        } else if (size == 2){
            System.out.println(9);
        } else if (size == 3){
            int ans = 9 + (n - 100 + 1);
            System.out.println(ans);
        } else if (size == 4){
            System.out.println(109);
        } else if (size == 5) {
            int ans = 109 + (n - 10000 + 1);
            System.out.println(ans);
        } else if (size == 6) {
            //int ans = 109 + (n - 10000 + 1);
            System.out.println(90909);
        }

    }
}