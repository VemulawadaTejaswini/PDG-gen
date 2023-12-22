import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);
        String[] words = tec.nextLine().split(" ");
        System.out.println(words[1]+words[0]);
    }
}