import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        List<Integer> aList = new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
            aList.add(Integer.parseInt(sc.next()));
        }

        int AorB = 0;
        int sumA = 0;
        int sumB = 0;
        int aLength = N;

        for (int i=0; i<N; i++) {
            int flag = 0;
            for (int j = 0; j<aLength; j++) {
                if (aList.get(j) > flag) {
                    flag = aList.get(j);
                }
            }
            aList.remove(aList.indexOf(flag));
            aLength -= 1;
            if (AorB == 0) {
                AorB = 1;
                sumA += flag;
            } else {
                AorB = 0;
                sumB += flag;
            }
        }

        System.out.println(sumA - sumB);
    }
}
