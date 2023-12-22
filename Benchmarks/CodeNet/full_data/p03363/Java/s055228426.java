import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        long[] aArr = new long[size];

        for (int i = 0; i < size; i++) {
            aArr[i] = s.nextLong();
        }


        int count = 0;

        for (int keta = 1; keta < size; keta++) {
            int sum = 0;
            for (int i = 0; i < keta; i++) {
                sum += aArr[i];
            }
            if (sum == 0) {
                //System.out.println("l:" + 0 + ", r:" + (keta - 1));
                count += 1;
            }
            for (int left = 1; left <= size - keta; left++) {
                sum -= aArr[left - 1];
                sum += aArr[left + keta - 1];
                if (sum == 0) {
                    //System.out.println("l:" + left + ", r:" + (left + keta - 1));
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
