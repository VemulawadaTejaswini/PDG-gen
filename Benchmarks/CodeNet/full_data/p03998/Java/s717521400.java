import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sa = sc.next();
        String Sb = sc.next();
        String Sc = sc.next();

        char nextCard = 'a';
        String winner = "";

        while (winner.isEmpty()) {
            switch (nextCard) {
                case 'a':
                    if (Sa.length() == 0) {
                        winner = "A";
                        break;
                    }
                    nextCard = Sa.charAt(0);
                    Sa = Sa.substring(1, Sa.length());
                    break;
                case 'b':
                    if (Sb.length() == 0) {
                        winner = "B";
                        break;
                    }
                    nextCard = Sb.charAt(0);
                    Sb = Sb.substring(1, Sb.length());
                    break;
                case 'c':
                    if (Sc.length() == 0) {
                        winner = "C";
                        break;
                    }

                    nextCard = Sc.charAt(0);
                    Sc = Sc.substring(1, Sc.length());
                    break;

            }
        }
        System.out.println(winner);
    }
}
