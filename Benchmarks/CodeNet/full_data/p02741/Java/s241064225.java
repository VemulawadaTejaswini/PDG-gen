import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {

        int[] iNum = { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1,
                51 };

        Scanner sc = new Scanner(System.in);
        int iNext = sc.nextInt();

        int iResult = iNum[iNext - 1];
        System.out.print(iResult);
    }
}
