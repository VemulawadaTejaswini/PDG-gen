import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c[] = new String[3];
        String m[][] = new String[3][3];
        for (int i = 0; i < 3; i++)
            c[i] = sc.nextLine();
        for (int i = 0; i < 3; i++)
            m[i] = c[i].split("");
        System.out.println(m[0][0] + m[1][1] + m[2][2]);
    }
}