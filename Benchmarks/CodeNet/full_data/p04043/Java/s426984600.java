import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(s.nextInt() == 5 && s.nextInt() == 7 && s.nextInt() == 5 ? "Yes" : "No");
    }

}