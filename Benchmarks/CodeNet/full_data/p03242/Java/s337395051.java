import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");

        for (int i = 0; i < 3; i++) {
            if (n[i].equals("1")) n[i] = "9";
            else if (n[i].equals("9")) n[i] = "1";
        }

        System.out.println(String.format("%s%s%s", n[0], n[1], n[2]));
    }
}