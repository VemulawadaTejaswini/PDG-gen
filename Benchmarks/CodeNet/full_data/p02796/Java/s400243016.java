import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i=0; i<N; i++) {
            map.put(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        sc.close();

        int[] X = new int[N];
        int[] L = new int[N];
        int i=0;
        for (int key : map.keySet()) {
            X[i] = key;
            L[i] = map.get(key);
            i++;
        }

        int cnt = N;
        for (i=1; i<N-1; i++) {
            if(X[i]>0 && X[i]-L[i]<X[i-1]+L[i-1] && X[i]+L[i]>X[i+1]-L[i+1]) {
                X[i] = 0;
                L[i] = 0;
                cnt--;
            }
        }
        for (i=1; i<N; i++) {
            if(X[i]>0 && X[i]-L[i]<X[i-1]+L[i-1]) {
                X[i] = 0;
                L[i] = 0;
                cnt--;
            }
        }

        System.out.println(cnt);
    }
}