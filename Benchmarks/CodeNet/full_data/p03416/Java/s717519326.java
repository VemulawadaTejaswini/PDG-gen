import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int count = 0;
        for (int i = A; i <= B; i++) {
            String temp = String.valueOf(i);
            boolean isPal = true;
            for (int j = 0; j < 2; j++) {
                if (temp.charAt(j) != temp.charAt(4 - j)) {
                    isPal = false;
                    break;
                }
            }
            if (isPal) {
                count++;
            }
        }

        System.out.println(count);

    }
}