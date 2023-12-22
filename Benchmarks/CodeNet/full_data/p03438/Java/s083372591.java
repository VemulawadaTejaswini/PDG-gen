import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        int[] a = new int[n];
        int[] b = new int[n];

        String aStr = scanner.nextLine();
        String bStr = scanner.nextLine();

        String[] aSplit = aStr.split(" ");
        String[] bSplit = bStr.split(" ");

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aSplit[i]);
            b[i] = Integer.parseInt(bSplit[i]);
            sumA += a[i];
            sumB += b[i];
        }

        if (sumA > sumB) {
            System.out.print("No");
            return;
        }

        if ((sumB - sumA) % 2 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
