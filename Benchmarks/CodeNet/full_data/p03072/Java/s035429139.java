import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt()- 1, a = s.nextInt(), c = 1;
        for(;n-->0;) {
            int b = s.nextInt();
            if (a <= b) {
                ++c;
                a = b;
            }
        }
        System.out.println(c);
    }
}
