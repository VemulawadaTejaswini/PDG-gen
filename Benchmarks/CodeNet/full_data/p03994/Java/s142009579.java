import java.util.Scanner;

/**
 * Created by donamphuong on 25/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        if(s.hasNext()) {
            String str = s.next().toLowerCase().trim();
            if(s.hasNext()) {
                int numPreform = s.nextInt();
                String newStr = "";

                for(int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);

                    if (numPreform == 0) {
                        break;
                    }

                    int diff = 26 - (c - 'a');

                    if (c > 'a' && diff <= numPreform) {
                        newStr += opS(c, diff);
                        numPreform -= diff;
                    } else if(i == str.length() - 1 && numPreform > 0) {
                        newStr += opS(c, numPreform);
                    } else {
                        newStr += c;
                    }
                }
                System.out.println(newStr);
            }
        }

       // System.out.println(opS('x', 3));
    }

    public static char opS(char c, int iter) {
        char newChar = c;

        for(int i = 0; i < iter; i++) {
            if(newChar == 'z') {
                newChar = 'a';
            } else {
                newChar = (char) (((int) newChar) + 1);
            }
        }
        return newChar;
    }
}
