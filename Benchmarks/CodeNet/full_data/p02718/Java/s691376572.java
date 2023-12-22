import java.util.*;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cons[] = new int[n];
        int allCount = 0;

        for (int i = 0; i < cons.length; i++) {
            cons[i] = sc.nextInt();
            allCount += cons[i];
        }

        int count = 0;
        for (int i = 0; i < cons.length; i++) {
            if (!(cons[i] < allCount / (4 * m))) {
                count++;
            }
        }

        String flg = "No";
        if (count >= m) {
            flg = "Yes";
        }
        System.out.println(flg);
    }
}