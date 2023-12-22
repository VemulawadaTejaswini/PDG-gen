import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[3];
        String[] T = new String[3];

        for (int i = 0; i < 3; i++) {
            S[i] = sc.next();
        }
        for (int i = 0; i < 3; i++) {
            T[i] = sc.next();
        }

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (S[i].equals(T[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}