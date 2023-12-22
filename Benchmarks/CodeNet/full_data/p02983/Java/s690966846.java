
import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();

        long result = INF1;
        if((l <= 2019 && 2019 <= r)){
            result = 0;
        }else if(r < 2019) {
            result = (r*(r-1)) % 2019;
        } else if(l > 2019) {
            long waru = l / 2019;
            long warur = r / 2019;
            if(waru < warur){
                result = 0;
            }else{

                
                for(long tmp=l; tmp<=r; tmp++){
                    for(long tmp1=tmp+1; tmp1<=r;tmp1++){
                        long a = (tmp*tmp1) % 2019;
                        result = Math.min(a,result);
                    }
                }

            }

        }

        System.out.println(result);

    }
}
