import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().replace("\n", "");
        sc.close();

        if (a >= 3200) {
            System.out.println(s);
        } else {
            System.out.println("red");
        }
    }
}
