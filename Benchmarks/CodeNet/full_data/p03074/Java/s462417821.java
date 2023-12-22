import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        sc.close();

        int pos = 0;
        List<Integer> num = new ArrayList<Integer>();
        List<Character> flag = new ArrayList<Character>();
        while (pos < N) {
            int count = 0;
            char curObj = S.charAt(pos);
            while (S.charAt(pos) == curObj) {
                count++;
                if (pos < N - 1) {
                    pos++;
                } else {
                    break;
                }
            }
            num.add(count);
            flag.add(curObj);

            if (S.charAt(pos) != curObj) {
                continue;
            } else if (pos == N - 1){
                break;
            }
        }
        // System.out.println(num);
        // System.out.println(flag);

        List<Integer> sumLog = new ArrayList<Integer>();
        List<Integer> sumFlag = new ArrayList<Integer>();
        int max_cur = 0;
        for (int i = 0; i < num.size(); i++) {
            // System.out.println("Round" + i);
            if (flag.get(i) == '0') {
                // System.out.println(flag.get(i));
                // System.out.println(sumLog);
                // System.out.println(sumFlag);
                for (int m = 0; m < sumLog.size(); m++) {
                    if (sumFlag.get(m) == 0) {
                        sumLog.remove(m);
                        sumFlag.remove(m);
                        m--;
                        // System.out.println("inside of first loop");
                    }
                }
                // System.out.println("first loop");
            }

            for (int j = 0; j < sumLog.size(); j++) {
                sumLog.set(j, sumLog.get(j) + num.get(i));
                if (flag.get(i) == '0') {
                    sumFlag.set(j, sumFlag.get(j) - 1);
                }
                // System.out.println(sumLog);
                // System.out.println(sumFlag);
                // System.out.println("second loop");
            }

            sumLog.add(num.get(i));
            if (flag.get(i) == '0') {
                sumFlag.add(K - 1);
            } else {
                sumFlag.add(K);
            }

            for (int k = 0; k < sumLog.size(); k++) {
                if (max_cur < sumLog.get(k)) {
                    max_cur = sumLog.get(k);
                }
            }
            // System.out.println(max_cur);
            // System.out.println(sumLog);
            // System.out.println(sumFlag);
            // System.out.println("================");
        }
        System.out.println(max_cur);
    }
}
