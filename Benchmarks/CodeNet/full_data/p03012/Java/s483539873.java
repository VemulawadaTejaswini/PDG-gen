import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> o = new ArrayList<>();
        for(int i = 0;i < n;i++){
            o.add(sc.nextInt());
        }
        long min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            List<Integer> g1 = new ArrayList<>();
            List<Integer> g2 = new ArrayList<>();
            long r1 = 0;
            long r2 = 0;
            for(int j = 0;j < i;j++){
                g1.add(o.get(j));
            }
            for(int j = i;j < n;j++){
                g2.add(o.get(j));
            }
            for(int one : g1){
                r1 += one;
            }
            for(int two : g2){
                r2 += two;
            }
            long r = r1 - r2;
            if(r < 0){
                r *= -1;
            }
            if(min > r){
                min = r;
            }
        }
        System.out.println(min);
    }
}