import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<ArrayList<Long>> X = new ArrayList<ArrayList<Long>>();
        for (int i = 0; i < N; i++) {
            ArrayList<Long> l = new ArrayList<Long>();
            X.add(l);
        }

        for (int i = 0; i < N; i++) {
            Long x = scanner.nextLong();
            for(int j = 0;j <N;j++) {
                if(i != j) {
                    X.get(j).add(x);
                }
            }


        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            ArrayList<Long> C = X.get(i);
            Collections.sort(C);
            // Long[] A = C.toArray(new Long[N-1]);
            // Arrays.sort(A);
            // System.out.println(C);
            int l = C.size();
            int d = (l + 1) / 2;

            Long ans = C.get(d - 1);
            System.out.println(ans);
        }
//        System.out.println(System.currentTimeMillis() - startTime);
    }
}