
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() / 2;
        P[] aq = new P[100000];
        P[] bq = new P[100000];
        for (int i = 0;i < 100000;++i){
            aq[i] = new P();
            aq[i].index = i;
            bq[i] = new P();
            bq[i].index = i;
        }
        for (int i = 0;i < n * 2;++i){
            int d = sc.nextInt();
            if(i % 2 == 1){
                ++bq[d].num;
            }
            else{
                ++aq[d].num;
            }
        }
        ArrayList<P> aps = new ArrayList<>(Arrays.asList(aq));
        ArrayList<P> bps = new ArrayList<>(Arrays.asList(bq));
        aps.sort((a,b) -> b.num - a.num);
        bps.sort((a,b) -> b.num - a.num);
        if(n >= 2&&aps.get(0).index == bps.get(0).index){
            if(aps.get(0).num - bps.get(0).num >= 0){
                System.out.println(n * 2 - aps.get(0).num - bps.get(1).num);
            }
            else{
                System.out.println(n * 2 - aps.get(1).num - bps.get(0).num);
            }
        }
        else{
            System.out.println(n * 2 - aps.get(0).num - bps.get(0).num);
        }

    }

    static class P{
        public int index = 0;
        public int num = 0;
    }


}



