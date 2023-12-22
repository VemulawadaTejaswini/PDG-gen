import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A1 = new int[N];
        int[] A2 = new int[N];
        for (int i = 0; i < N; i++) {
            A1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A2[i] = sc.nextInt();
        }

        List<Integer> result_list = new ArrayList<Integer>();
        int firstline_result = 0;
        for (int i=0; i < A1.length; i++) {
            firstline_result += A1[i];
            int tmp = firstline_result;
            for (int k=i; k < A2.length; k++) {
                tmp += A2[k];
            }
            result_list.add(tmp);
        }

        int max = result_list.get(0);
        for (int i = 1; i < result_list.size(); i++) {
            int v = result_list.get(i);
            if (v > max) {
                max = v;
            }
        }

        System.out.println(max);
    }
}
