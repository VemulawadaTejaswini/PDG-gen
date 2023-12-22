import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P[] = new int[M];
        int Y[] = new int[M];
        for(int i=0; i<M; i++) {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        String R[] = new String[M];

        ArrayList<Map<Integer, Integer>> am = new ArrayList<>();
        for(int i=0; i<M; i++) {
            am.add(new HashMap<>());
        }

        for(int i=0; i<M; i++) {
            am.get(P[i]-1).put(Y[i], i);
        }

        for(int t=0; t<N; t++) {
            Set<Integer> s = am.get(t).keySet();
            List<Integer> li = new ArrayList<>(s);
            Collections.sort(li);
            int count = 1;
            for(Integer i : li) {
                int k = am.get(t).get(i);
                R[k] = String.format("%06d%06d", t+1, count);
                count++;
            }
        }

        for(int i=0; i<M; i++) {
            System.out.println(String.format("%s", R[i]));
        }
    }
}
