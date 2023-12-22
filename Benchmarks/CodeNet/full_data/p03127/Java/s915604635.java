
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) { A.add(sc.nextInt()); }

        solver(N, A);
    }

    public static void solver(int N, List<Integer> A) {

        while(true) {
            Collections.sort(A);
            int min = A.get(0);

            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(min);

            for (int i = 1; i < A.size(); i++) {
                if (A.get(i) % min != 0) {
                    tmp.add(A.get(i) % min);
                }
            }

            A = tmp;

            if(tmp.size() == 1){
                out.println(tmp.get(0));
                break;
            }

            //for(int i : tmp){
            //    out.print(i + ",");
            //}
            //out.println();
        }
    }
}