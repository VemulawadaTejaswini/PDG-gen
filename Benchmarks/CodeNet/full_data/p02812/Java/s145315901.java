import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N = Integer.parseInt((new Scanner(System.in)).nextLine());
        String string = (new Scanner(System.in)).nextLine();
        int count = 0;
        for (int i = 0; i < string.length()-2; i++) {
            if (string.toUpperCase().charAt(i) == 'A' && string.toUpperCase().charAt(i+1) == 'B' && string.toUpperCase().charAt(i+2) == 'C') {
                count++;
            }
        }
        System.out.println(count);
    }
}
