import javafx.util.Pair;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        Map<Pair<Integer,Integer>,Integer> map = new HashMap<>();
        for(int i=1;i<=N;i++){
            if(i%10!=0) {
                Pair<Integer, Integer> P = F(i);
                if (map.get(P) == null) map.put(P, 1);
                else map.replace(P, map.get(P) + 1);
            }
        }
        for(int i=1;i<=N;i++){
            if(i%10!=0) {
                Pair<Integer, Integer> P = F(i);
                Pair<Integer, Integer> Q = new Pair<>(P.getValue(), P.getKey());
                if (map.get(Q) != null) sum += map.get(Q);
            }
        }
        System.out.println(sum);
    }
    public static Pair<Integer,Integer> F(int i) {
        int a = i % 10;
        int b = 0;
        while (i != 0) {
            b = i;
            i /= 10;
        }
        Pair<Integer, Integer> P = new Pair<>(a, b);
        return P;
    }
}