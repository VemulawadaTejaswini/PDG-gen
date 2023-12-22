import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int left = s.indexOf('A');
            int right = s.lastIndexOf('Z');
            System.out.println(right - left + 1);
        }
    }
}
