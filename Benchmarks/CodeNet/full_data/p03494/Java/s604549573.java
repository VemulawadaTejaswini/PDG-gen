import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = new int[scanner.nextInt()];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }

        int count = 0;
        boolean flg = true;
        while (flg) {
            if (numArray[0] % 2 == 0 && numArray[1] % 2 == 0 && numArray[2] % 2 == 0) {
                count++;
                numArray[0] /= 2;
                numArray[1] /= 2;
                numArray[2] /= 2;
            } else {
                flg = false;
            }
        }

        System.out.println(count);
    }
}