import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        if(s.hasNext()) {
            String input = s.next();
            System.out.println(input.substring(0, 3) + " " + input.substring(4));
        }
    }
}
