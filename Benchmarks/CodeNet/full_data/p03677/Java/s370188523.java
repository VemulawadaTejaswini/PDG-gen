import java.math.BigInteger;
import java.util.*;

/**
 * Created by zaraki on 2017/08/27.
 */
public class Main {
    private static int n;
    private static int m;
    private static int x;
    private static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void input(){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        for(int i = 0; i< n; i++) {
            arrayList.add(scan.nextInt());
        }
    }

    public static void main(String args[]) {
        //入力
        input();

        int ans = 1000000000;

        for (int i=1;i<=m;i++){
            x = i;  //お気に入りがiのとき
            int count = 0;
            for (int j=0;j<n-1;j++){
                if(arrayList.get(j) > arrayList.get(j+1)){
                    if(arrayList.get(j) < x) count += arrayList.get(j+1) + m - x + 1;
                    else if(arrayList.get(j+1) >= x) count += arrayList.get(j+1) - x + 1;
                    else count += m - arrayList.get(j) + arrayList.get(j+1);
                }else if(arrayList.get(j) < x && x <= arrayList.get(j+1)) count += arrayList.get(j+1) - x + 1;
                else if(x <= arrayList.get(j) || arrayList.get(j+1) < x) count += arrayList.get(j+1) - arrayList.get(j);
                //System.out.print(count + " ");
            }
            //System.out.println("count::"+count);
            ans = Math.min(ans , count);
        }
        System.out.println(ans);
    }
}
