import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int counter = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                counter++;
            }
        }
        int res = counter;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == 'W') {
                counter++;
            }
            if (s.charAt(i) == 'E') {
                counter--;
            }
            res = Math.min(res, counter);
        }
        System.out.println(res);
        sc.close();
    }
}