import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long l = Integer.parseInt(sc.next());
        long r = Integer.parseInt(sc.next());
        int res = 2018;
        int hi = 0;
        for (int x=(int)l; x<=r; x++) {
            long tmp = (x*(x+1))%2019;
            int tp = int(tmp);
            res = res<tp?res:tp;
            if (res==0) {
                System.out.println(res);
                return;
            }
            hi++;
            if (hi > 1000000) {
                break;
            }
        }
        System.out.println(res);
        
    }
}
