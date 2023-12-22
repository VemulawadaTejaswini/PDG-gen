import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int ans = 0;
        while(true) {
            if(list.size() == 0) {
                System.out.println(ans);
                return;
            }
            int min = list.get(0);
            int max = list.get(list.size() - 1);
            if(min < k - max) {
                ans += min * 2;
                list.remove(0);
            } else if(min > k - max){
                ans += (k - max) * 2;
                list.remove(list.size() - 1);
            } else {
                ans += min * 2;
                list.remove(0);
            }
        }
    }
}