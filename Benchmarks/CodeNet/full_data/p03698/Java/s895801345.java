import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();

        char[] charArray = s.toCharArray();

        boolean end = false;

        for (int i = 0; i < charArray.length; i++) {
            if (end == false) {
                for (int j = charArray.length - 1; i < j; j--) {
                    if (end == false) {
                        if (charArray[i] == charArray[j]) {
                            System.out.println("no");
                            end = true;
                        }
                    }
                }
            }

        }
        if (end == false) {
            System.out.println("yes");
        }
    }
}