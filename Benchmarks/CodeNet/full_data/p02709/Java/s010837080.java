import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Tuple> A = new ArrayList<>();
        for(int i=1;i<=N;i++){
            int value = sc.nextInt();
            Tuple T = new Tuple();
            T.element(i,value);
            A.add(T);
        }
        Collections.sort(A, new Comparator<Tuple>() {
            @Override
            public int compare(Tuple o1, Tuple o2) {
                return o1.value>=o2.value ?-1:1;
            }
        });
        long DP [][] = new long[N+1][N+1];
        for(int i=0;i<N+1;i++)Arrays.fill(DP[i],0);
        for(int i=0;i<A.size();i++){
            int key = A.get(i).key;
            long value = (long)A.get(i).value;
            for(int j=0;j<=i;j++){
                DP[j+1][i-j] = Math.max(DP[j+1][i-j],DP[j][i-j]+value*(long)Math.abs(key-(j+1)));
                DP[j][i-j+1] = Math.max(DP[j][i-j+1],DP[j][i-j]+value*(long)Math.abs(key-(N-(i-j))));
            }
        }
        long ans = 0;
        for(int i=0;i<=N;i++) ans = Math.max(ans,DP[i][N-i]);
        System.out.println(ans);
    }
    /*内部クラス*/
    public static class Tuple {
        public int key;
        public int value;

        public void element(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}