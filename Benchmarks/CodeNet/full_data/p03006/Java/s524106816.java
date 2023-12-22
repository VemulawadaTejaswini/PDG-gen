import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int ans = n;

        Map<P, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int s = arr[j][0]-arr[i][0];
                int t = arr[j][1]-arr[i][1];
//                System.out.println(s);
//                System.out.println(t);
                P p = new P(s, t);
                if (map.containsKey(p)){
                    int tmp = map.get(p);
                    map.put(p, tmp+1);
                }else {
                    map.put(p, 1);
                }
            }
        }

        int max = 1;

        for (P key: map.keySet()){
            max = Math.max(max, map.get(key));
//            System.out.println(map.get(key));
        }

        System.out.println(n-max);
    }

    public static class P{
        int s;
        int t;
        public P(int s, int t){
            this.s = s;
            this.t = t;
        }
        @Override
        public boolean equals(Object obj){
            if (obj instanceof P){
                P key = (P) obj;
                return this.s==key.s && this.t==key.t;
            }else {
                return false;
            }
        }
        @Override
        public int hashCode(){
            return Objects.hash(s, t);
        }

    }
}
