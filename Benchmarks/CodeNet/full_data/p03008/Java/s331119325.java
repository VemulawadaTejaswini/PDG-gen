import java.util.*;

public class Main {

  static  class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x =x;
            this.y =y;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ga = sc.nextInt();
        int sa = sc.nextInt();
        int ba = sc.nextInt();
        int gb = sc.nextInt();
        int sb = sc.nextInt();
        int bb = sc.nextInt();


        int maxMult =0;
        TreeMap<Double,Pair> m = new TreeMap<Double, Pair>( Collections.reverseOrder() );
        m.put((double)ga/gb, new Pair(ga,gb));
        m.put((double)gb/ga, new Pair(gb,ga));
        m.put((double)sa/sb, new Pair(sa,sb));
        m.put((double)sb/sa, new Pair(sb,sa));
        m.put((double)ba/bb, new Pair(ba,bb));
        m.put((double)bb/ba, new Pair(bb,ba));

        int ans = 0;
        while(N>0){
            Map.Entry<Double,Pair> e = m.firstEntry();
            if(e.getKey()<=1) break;
            Pair  p = e.getValue();
            ans  += N/p.y * p.x ;
            N = N% p.y;
        }


        System.out.println(ans+N);

    }

}
