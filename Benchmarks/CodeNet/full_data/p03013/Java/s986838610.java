import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] arr = new int[m];
        int prev1 = -1;
        for (int i = 0; i < m; i++) {
            int broken = s.nextInt();
            if (broken == prev1 + 1) {
                System.out.println(0);
                return;
            }
            arr[i] = prev1 = broken;
        }

        int prev2;
        int[] renzoku = new int[m + 1];
        renzoku[0] = arr[0];
        int maxRen = arr[0];
        prev2 = arr[0];
        for (int i = 1; i < m; i++) {
            int next = arr[i];
            renzoku[i] = next - prev2 - 1;
            maxRen = Math.max(maxRen, renzoku[i]);
            prev2 = next;
        }
        renzoku[m] = n - prev2;
        maxRen = Math.max(maxRen, renzoku[m]);
        System.out.println("renzoku = " + renzoku);

        // 1: 1
        // 2: 1
        // 3: 2
        // 4: 3
        // 5: 5
        // 6: 8

        ArrayList<Integer> fiboArr = new ArrayList<>(maxRen);
        fiboArr.add(1);
        fiboArr.add(1);
        fiboArr.add(2);
        fiboArr.add(3);
        fiboArr.add(5);
        fiboArr.add(8);
        fiboArr.add(13);
        fiboArr.add(21);
        fiboArr.add(34);

        long answer = 1;
        for (int i = 0; i < m + 1; i++) {
            answer *= fibo(fiboArr, renzoku[i]);
            answer %= 1000000007;
        }

        System.out.println(answer);
    }

    private static int fibo(ArrayList<Integer> temp, int _i) {
        int i = _i - 1;
        if (temp.size() > i) {
            return temp.get(i);
        }
        int last = temp.size();

        for (int i1 = last; i1 <= i; i1++) {
            temp.add(temp.get(i1 - 2) + temp.get(i1 - 1));
        }
        return temp.get(i);
    }
}
