import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        for (int i = 0; i < 3; i++) {
            a += sc.next().split("")[i];
        }
        System.out.println(a);
    }
}
