import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char[] chars = s.toCharArray();

        if(n%2==1) {
            System.out.println("No");
        } else {
            for (int i = 0; i < n / 2; i++) {
                if(chars[i] != chars[i+n/2]){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
