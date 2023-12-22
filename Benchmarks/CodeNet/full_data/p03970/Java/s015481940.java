import java.util.Scanner;

/**
 * Created by donamphuong on 25/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        String original = "CODEFESTIVAL2016";
        Scanner input = new Scanner(System.in);

        if(input.hasNext()) {
            String in = input.next();
            int iter = 0;

            for(int i = 0; i < original.length(); i++) {
                if(original.charAt(i) != in.charAt(i)) {
                    iter++;
                }
            }

            System.out.println(iter);

        }
    }
}
