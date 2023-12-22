import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int length = s.length();
        int half = length / 2;
        int lastIndex = length - 1;
        int hag = 0;
        for (int i = 0; i < half; i++) {
            if (s.charAt(i) != s.charAt(lastIndex - i)) {
                hag++;
            }
        }
        System.out.println(hag);
    }

}
