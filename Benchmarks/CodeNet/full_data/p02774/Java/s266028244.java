import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mn = 0;
        List<Long> A = new ArrayList<>();
        List<Long> Am = new ArrayList<>();
        for(int i =0; i < N; i++) {
            long n = scanner.nextLong();
            if(n < 0) {
                mn++;
                Am.add(n);
            }else{
                A.add(n);
            }

        }
        java.util.Collections.sort(A);

        List<Long> list = new ArrayList<>();

        int ptn = mn * (N - mn);
        if(ptn < K) {
            K = K - ptn;
            for(int j = 0; j < A.size() - 1; j++) {
                for(int i = j + 1; i < A.size(); i++) {
                    list.add(A.get(i) * A.get(j));
                }
            }
            for(int j = 0; j < Am.size() - 1; j++) {
                for(int i = j + 1; i < Am.size(); i++) {
                    list.add(Am.get(i) * Am.get(j));
                }
            }
            java.util.Collections.sort(list);
            System.out.println(list.get(K-1));
        }else{
            for(int j = 0; j < Am.size(); j++) {
                for(int i = 0; i < A.size(); i++) {
                    list.add(A.get(i) * Am.get(j));
                }
            }
            java.util.Collections.sort(list);
            System.out.println(list.get(K-1));
        }

    }
}