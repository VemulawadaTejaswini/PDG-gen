import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;
import static java.util.Collections.reverseOrder;

public class Main {
  	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int card = in.nextInt();
        int gate = in.nextInt();
        List<Integer> min = new ArrayList<Integer>(gate);
        List<Integer> max = new ArrayList<Integer>(gate);
        int cch;
        for (int i = 0; i < gate; i++) {
            for (int j = 0; j < 2; j++) {
                cch = in.nextInt();
                if (j == 0) {
                    min.add(cch);
                } else {
                    max.add(cch);
                }
            }
        }
        in.close();
        sort(max);
        sort(min, reverseOrder());
        int ans = max.get(0) - min.get(0) + 1;
        if (ans < 0) ans = 0;
        System.out.println(ans);

    }
}