import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = 0;
        int l = 0;
        int g = 0;
        int p = 0;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'g') {
                if (g > p) {
                    w++;
                    p++;
                } else {
                    g++;
                }
            } else {
                if (g > p) {
                    p++;
                } else {
                    l++;
                    g++;
                }
            }
        }
        System.out.println(w - l);
    }
}