import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }

for (int i = 0; i < intArray.length; i++) {
            boolean flg = true;
            for (int j = 0; j <= i; j++) {
                if (intArray[i] > intArray[j]) {
                    flg = false;
                    break;
                }
            }
            if (flg) {
                count++;
            }
        }
        System.out.println(count);
    }

}
