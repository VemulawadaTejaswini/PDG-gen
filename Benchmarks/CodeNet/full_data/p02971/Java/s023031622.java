import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = String.valueOf(A[i]);
        }
        List<String> slist = new ArrayList<String>(Arrays.asList(s));
        for (int j = 0; j < N; j++) {
            slist.remove(s[j]);
          	String[] snew = (String[])slist.toArray(new String[slist.size()]);
            int[] A1 = new int[N - 1];
            for (int k = 0; k < N - 1; k++) {
                A1[k] = Integer.valueOf(snew[k]);
            }
          	slist.add(s[j]);
            int[] max = new int[N];
            for (int k = 0; k < N-1; k++) {
                if (max[j] < A1[k]) {
                    max[j] = A1[k];
                }
            }
            System.out.println(max[j]);
        }

        scan.close();
    }
}