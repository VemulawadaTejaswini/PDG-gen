import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s1 = sc.next().split("");

        int num = 0;
        int min = 0;
        int total = 0;
        boolean less = false;
        int lcount = 0;
        for (String s: s1) {
            if (s.equals("<")) {
                num += 1;
                if (less) {
                    if (min < 0) total += (lcount+1) * (0-min);
                    else total -= lcount * (num-1);
                    less = false;
                    lcount = 0;
                    num = 1;
                    min = 100000000;
                }
            } else {
                num -= 1;
                less = true;
                lcount ++;
            }
            if (num < min) min = num;
            total += num;
        }
        if (less && min < 0) {
            total += (lcount+1) * (0-min);
        } else if(less) {
            total -= lcount * num;
        }
        System.out.println(total);
    }
}
