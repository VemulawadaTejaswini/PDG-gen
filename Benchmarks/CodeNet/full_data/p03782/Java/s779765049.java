import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by paz on 17-3-18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        long sum = 0;
        for(int i =0; i < N ;i++) {
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        Collections.sort(list);
        int i = 0;
        boolean flag = true;
        for(; i < N; i++) {
            sum += list.get(i);
            if(sum >= K) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(N);
        } else {
            int res = 0;
            int j;
            for(j = i; j >= 0; j--) {
                if(sum - list.get(j) >= K) {
                    System.out.println(j +1);
                    break;
                }
            }
            if(j == -1) {
                System.out.println(0);
            }
        }
    }
}