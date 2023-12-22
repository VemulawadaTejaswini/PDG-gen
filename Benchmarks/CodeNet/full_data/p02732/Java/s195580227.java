import java.util.HashMap;
import java.util.Scanner;

public class Main {

    Main(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        HashMap<Integer, Long> HM = new HashMap();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            HM.put(A[i], HM.getOrDefault(A[i],0L)+1);
        }

        long T = 0;
        for (int i = 0; i < N; i++) {
            if (HM.containsKey(i)){
                T += HM.get(i) * (HM.get(i) - 1)/2;
            }
        }

        for (int i = 0; i < N; i++) {
            if (HM.containsKey(A[i])){
                System.out.println(T - HM.get(A[i]) + 1);
            } else {
                System.out.println(T);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
