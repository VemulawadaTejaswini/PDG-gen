import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++)
            D[i] = sc.nextInt();

        int numOfChild = 1;
        int numOfParent = 1;
        int count = 1;
        Arrays.sort(D);

        if (D[0] != 0) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i < N - 1; i++) {
            if (D[i] == D[i + 1]) {
                numOfParent++;

            } else {
                if (D[i] + 1 != D[i + 1]) {
                    System.out.println(0);
                    return;
                } else {
                    for (int j = i; j < N - 1; j++) {
                        if (D[j] == D[j + 1]) {
                            numOfChild++;
                        }
                    }
                    count *= Math.pow(numOfParent, numOfChild);
                    numOfParent = 1;
                    numOfChild = 1;
                }
            }
        }

/*
        for (int i = 0; i < N - 1; i++) {
            if (D[i] == D[i + 1]) {
                numOfNum++;
            } else {
                if (D[i] + 1 == D[i + 1]) {
                    count *= numOfNum;
                    numOfNum = 1;
                } else {
                    System.out.println(0);
                    return;
                }
            }
        }
*/

        System.out.println(count % 998244353);


    }
}