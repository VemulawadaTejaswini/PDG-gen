import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            char c = sc.next().toCharArray()[0];

            System.out.println((char) (c + 1));
        }
    }

}
