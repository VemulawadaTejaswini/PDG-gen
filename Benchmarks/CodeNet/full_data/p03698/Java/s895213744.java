import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();

        sc.close();

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length - 1; j++) {
                if (ch[j] == ch[i]) {
                    System.out.println("no");
                    return;
                }
            }
        }

        System.out.println("yes");
    }
}