import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String before = sc.next();

        for (int i = 0; i < 12; i++) {
            System.out.print(before.charAt(i));
            if (i == 3) {
                System.out.print(' ');
            }
        }
        
        System.out.println();
    }
}
