import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        ArrayList<Long> arr = new ArrayList<>();
        for (long i = 1; i < 10; i++) {
            arr.add(i);
        }
        int index = 0;
        int end = arr.size();
        while(end < k) {
           long  tmp = arr.get(index);
            long digit = tmp % 10;
            int count = 0;
            for (int i = -1; i < 2; i++) {
                long digitnew = digit + i;
                if (digitnew  >= 0 && digitnew <=9) {
                    arr.add(tmp*10+digitnew);
                    count++;
                }
            }
            index++;
            end += count;
        }
        System.out.println(arr.get(k-1));
    }
}
