import java.util.*;
public class D103{
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Pair[] pairs = new Pair[m];
        for(int i = 0;i < M;i++){
            Pair ps = new Pair();
            ps.from = sc.nextInt();
            ps.end = sc.nextInt();
            pairs[i] = ps;
        }
        Arrays.sort(pairs);
        int cnt = 0;
        int nowclear = 0;
        for(i = 0; i<M; i++){
            int nowfrom = pairs[i].from;
            int nowend = pairs[i].end;
            if(nowclear < nowend){
                cnt++;
                nowclear = pairs[i].end - 1;
            }
        }
        System.out.println(cnt);
    }
}

class Pair implements Comparable{
    int from;
    int end;
    public int compareTo(Object other){
        Pair otherpair = (Pair) other;
        return end - otherpair.end;
    }
}