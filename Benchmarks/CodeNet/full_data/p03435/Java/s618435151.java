import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c[][] = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = scanner.nextInt();
                sum += c[i][j];
            }
        }
        if (sum % 3 == 0 && sum / 3 == c[0][0] + c[1][1] + c[2][2]) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
