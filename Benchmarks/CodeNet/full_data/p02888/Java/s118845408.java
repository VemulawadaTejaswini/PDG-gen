import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
            list.add(sc.nextInt());
        }

        int a;
        int b;
        int count = 0;

        for (int i=0; i<list.size(); i++) {
            a = list.get(i);

            for (int j=0; j<list.size(); j++) {
                if (j > i) {
                    b = list.get(j);
                } else {
                    continue;
                }

                for (int k=0; k<list.size(); k++) {
                    int c;
                    if (k > j && k > i) {
                        c = list.get(k);
                    } else {
                        continue;
                    }

                    if ((a < b + c) && (b < c + a) && (c < a + b)) {
                        count += 1;
                    }
                }
            }
        }

        System.out.println(count);

    }
}