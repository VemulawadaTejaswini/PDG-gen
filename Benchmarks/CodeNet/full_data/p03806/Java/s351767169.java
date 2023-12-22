import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        Med[] meds = new Med[n];
        for (int i = 0;i < n;++i){
            meds[i] = new Med(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        int s = search(meds, ma, mb, 0, 0, new boolean[n],-1, 0);
        System.out.println(s == Integer.MAX_VALUE ? -1 : s);

    }

    public static int search(Med[] meds,int ma,int mb,int na,int nb,boolean[] used,int la,int pr){
        int min = Integer.MAX_VALUE;
        if((na != 0||nb != 0)&&ma * nb == na * mb)return pr;
        for (int i = la + 1;i < meds.length;++i){
            if(!used[i]){
                int k = meds[i].a - meds[i].b;
                if(na == 0&&nb == 0){
                    boolean us[] = used.clone();
                    us[i] = true;
                    int o = search(meds,ma,mb,na + meds[i].a,nb + meds[i].b,us,i,pr + meds[i].pr);
                    min = min > o ? o : min;
                }
                if(k > 0&&ma * nb > mb * na){
                    boolean us[] = used.clone();
                    us[i] = true;
                    int o = search(meds,ma,mb,na + meds[i].a,nb + meds[i].b,us,i,pr + meds[i].pr);
                    min = min > o ? o : min;
                }
                else if(k < 0&&ma * nb < mb * na){
                    boolean us[] = used.clone();
                    us[i] = true;
                    int o = search(meds,ma,mb,na + meds[i].a,nb + meds[i].b,us,i,pr + meds[i].pr);
                    min = min > o ? o : min;
                }
            }
        }
        return min;
    }


    public static class Med{
        int a,b,pr;
        public Med(int a,int b,int pr){
            this.a = a;
            this.b = b;
            this.pr = pr;
        }
    }



}