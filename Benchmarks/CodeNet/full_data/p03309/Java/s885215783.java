import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://abc102.contest.atcoder.jp/tasks/arc100_a
public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(in.nextInt());
        }
        // abs(A1−(b+1))+abs(A2−(b+2))+…+abs(AN−(b+N))
        int max = Collections.max(a);

        int answer = Integer.MAX_VALUE;
        for (int i=-(max); i<=max+1; i++) {
            int tmp = 0;
            for (int j = 0; j<n; j++) {
                tmp += Math.abs(a.get(j)-(i+j+1));
            }
            answer = Math.min(answer, tmp);
        }
        System.out.println(answer);
    }
}
