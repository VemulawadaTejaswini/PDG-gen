import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by wild on 2016/07/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tmpmoney = scan.next().split("");
        int[] money = new int[tmpmoney.length];
        for (int i = 0; i < tmpmoney.length; i++) {
            money[i] = Integer.parseInt(tmpmoney[i]);
        }
        ArrayList<Integer> mon = new ArrayList<Integer>();
        for (int i = money.length - 1; i > -1; i--) mon.add(money[i]);
        int disnum = scan.nextInt();
        int[] num = new int[disnum];
        for (int i = 0; i < disnum; i++) {
            num[i] = scan.nextInt();
        }

        boolean ok = false;
        for (int i = 0; i < mon.size(); ) {
            if (mon.get(i) > 9) {
                if (i == mon.size() - 1) {
                    mon.set(i, 0);
                    mon.add(i + 1, 1);
                } else {
                    mon.set(i + 1, mon.get(i + 1) + 1);
                    mon.set(i, 0);
                }
            }

            for (int j = 0; j < num.length; j++) {
                if (mon.get(i) == num[j]) {
                    mon.set(i, mon.get(i) + 1);
                    break;
                } else {
                    //違うならばok
                    ok = true;
                    break;
                }
            }

            if (ok) {
                ok = false;
                i++;
            }
        }

        for (int i = mon.size()-1; i > -1; i--){
            System.out.print(mon.get(i));
        }
    }
}