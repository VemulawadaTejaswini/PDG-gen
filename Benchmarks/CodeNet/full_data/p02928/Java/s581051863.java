
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());//int型
        int K = Integer.parseInt(sc.next());

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < N; i++){
            a.add(Integer.parseInt(sc.next()));
        }

        long unit = 0;
        long add = 0;
        // a内の円筒数を数える
        for(int i = 0; i < N-1; i++){
            for (int j = i+1; j < N; j++) {
                if (a.get(i) > a.get(j)) {
                    unit++;
                }
            }
        }
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                if (a.get(i) > a.get(j)) {
                    add++;
                }
            }
        }

        long u = (unit*K) % (1000000000+7);
        long ad = (add*K*(K-1)/2) % (1000000000+7);
        long ans = (u+ad)%(1000000000+7);
        System.out.println(ans);
    }
}
