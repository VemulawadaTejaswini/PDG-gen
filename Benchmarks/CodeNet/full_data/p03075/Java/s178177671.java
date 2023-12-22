import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] antenas = new int[5];
        for (int i = 0; i < 5; i++) {
            antenas[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 5; j++) {
                if (Math.abs(antenas[i] - antenas[j]) > k) {
                    System.out.println(":(");
                    return;
                }
            }
        }

        System.out.println("Yay!");
    }
}
