import java.util.*;
public class Main{
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Pair[] pairs = new Pair[M];
        for(int i = 0;i < M;i++){
            Pair ps = new Pair();
            ps.from = sc.nextInt();
            ps.end = sc.nextInt();
            pairs[i] = ps;
        }
        Arrays.sort(pairs);
        int cnt = 0;
        int nowclear = 0;
        for(int i = 0; i<M; i++){
            int nowfrom = pairs[i].from;
            int nowend = pairs[i].end;
            if(nowclear < nowfrom){
                cnt++;
                nowclear = nowend - 1;
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