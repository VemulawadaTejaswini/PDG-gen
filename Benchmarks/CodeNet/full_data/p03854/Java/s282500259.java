import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        s = s.replace("dream", "");
        s = s.replace("dreamer", "");
        s = s.replace("erase", "");
        s = s.replace("eraser", "");

        if(s.length() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
