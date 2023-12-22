import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        sc.close();

        int cur = 0;
        int ans = 0;
        ArrayList<Integer> tmparr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans = 0;
            cur = 0;
            tmparr = (ArrayList<Integer>) arr.clone();
            tmparr.remove(i);
            for (Integer num : tmparr) {
                ans += Math.abs(cur - num);
                cur = num;
            }
            ans += Math.abs(cur);
            System.out.println(ans);
        }
    }
}