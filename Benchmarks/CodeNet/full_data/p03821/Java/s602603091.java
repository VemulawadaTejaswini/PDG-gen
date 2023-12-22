import java.util.*;

public class Main {
    public static void multipleAdd(int[] data, int idx) {
        for (int i = 0; i <= idx; i++) {
            data[i]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //Scanner sc = new Scanner(new FileReader("input.txt"));

        int arrayNum = sc.nextInt();
        int[] a = new int[arrayNum];
        int [] b = new int[arrayNum];

        for (int i = 0; i < arrayNum; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = arrayNum - 1; i >= 0; i--) {
            int base = b[i];

            while (true) {
                if (a[i] % base != 0) {
                    multipleAdd(a, i);
                    result++;
                } else {
                    break;
                }
            }
        }

        System.out.println(result);
    }
}