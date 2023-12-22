import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] t = {"dream", "dreamer", "erase", "eraser"};

        s = s.replace(t[0], "");
        s = s.replace(t[1], "");
        s = s.replace(t[2], "");
        s = s.replace(t[3], "");

        if(s.length() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
