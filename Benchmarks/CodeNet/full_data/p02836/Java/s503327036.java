import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isPalin = sc.next();
        int count = 0;
        for (int i = 0; i < isPalin.length(); i++) {
            if (isPalin.charAt(i) != isPalin.charAt(isPalin.length() - 1 - i)) {
                count++;
            }
        }
        System.out.println(count/2);
    }
}
