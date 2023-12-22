import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();


        if (s.charAt(0) != 'A') {
            System.out.println("WA1");
            System.exit(0);
        }

        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean b = true;
            if (1 < i && s.length() - 1 > i && c == 'C') {
                count++;
                b = false;
                if (count >= 2) {
                    System.out.println("WA");
                    System.exit(0);
                }
            }
            if (b && !((int) 'a' <= (int) c && (int) c <= (int) 'z')) {
                System.out.println("WA");
                System.exit(0);
            }
        }
        if (count ==0){
            System.out.println("WA");
            System.exit(0);
        }

        System.out.println("AC");


    }


}