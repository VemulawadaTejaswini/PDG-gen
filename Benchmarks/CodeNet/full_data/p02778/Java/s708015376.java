import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();

            String T = "";
            for (int i = 0; i < S.length(); i++) {
                T += "x";
            }

            System.out.println(T);
        }
    }

}
