import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] substr = str.split(" ", 0);

        System.out.println(str);
        System.out.println(substr[0]);
        System.out.println(substr[1]);
        int a = Integer.parseInt(substr[0]);
        int b = Integer.parseInt(substr[1]);
        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }

}