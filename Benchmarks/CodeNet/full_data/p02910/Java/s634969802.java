import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String step = sc.next();
        String[] s = step.split("");
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0 && s[i].equals("L")) {
                System.out.println("No");
                break;
            } else if (i % 2 == 1 && s[i].equals("R")) {
                System.out.println("No");
                break;
            } else {
                System.out.println("Yes");
            }
        }
    }
}
