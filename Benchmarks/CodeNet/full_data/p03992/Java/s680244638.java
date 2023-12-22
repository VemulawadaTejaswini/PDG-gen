import java.util.Scanner;

/**
 * Created by donamphuong on 25/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        if(s.hasNext()) {
            String input = s.next();
            System.out.println(input.substring(0, 4) + " " + input.substring(4));
        }
    }
}
