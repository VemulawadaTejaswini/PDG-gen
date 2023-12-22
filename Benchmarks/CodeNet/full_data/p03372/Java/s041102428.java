import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long circle = sc.nextLong();
        ArrayList<Sushi> sushi = new ArrayList<Sushi>();
        for(int i = 0 ; i < n; i++){
            long d = sc.nextLong();
            long c = sc.nextLong();
            Sushi s = new Sushi(d,c);
            sushi.add(s);
        }
        long now = 0;
        long ans = 0;
        for(int i = 0; i < n; i++){
            Sushi s = sushi.get(i);
            now += s.cal;
            long tmp = now;
            for(int j = n-1; j > i; j--){
                Sushi s2 = sushi.get(j);
                tmp += s2.cal;
                ans = Math.max(ans,tmp-(circle - s2.dist)-s.dist*2);
            }
            ans = Math.max(ans,now-s.dist);
        }
        now = 0;
        for(int i = n-1; i >= 0; i--){
            Sushi s = sushi.get(i);
            now += s.cal;
            long tmp = now;
            for(int j = 0; j < i; j++){
                Sushi s2 = sushi.get(j);
                tmp += s2.cal;
                ans = Math.max(ans,tmp-s2.dist-(circle-s.dist)*2);
            }
            ans = Math.max(ans,now-(circle - s.dist));
        }
        System.out.println(ans);
    }
}

class Sushi{
    long dist,cal;
    public Sushi(long d, long c){
        this.dist = d;
        this.cal = c;
    }
}