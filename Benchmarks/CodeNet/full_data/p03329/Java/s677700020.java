import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());

        int ans = 0;

        int power6 = 1;
        int power9 = 1;
        List<Integer> cmp = new ArrayList<>();


        while(true) {

            if(power6 * 6 < N) {
                power6 = power6 * 6;
                cmp.add(power6);
            }else{
                break;
            }

            if(power9 * 9 < N) {
                power9 = power9 * 9;
                cmp.add(power9);
            }else{
                break;
            }
        }
/*
        for(int i = cmp.size()-1; 0 <= i; i--){
            System.out.println(cmp.get(i));
        }
*/
        for(int i = cmp.size()-1; 0 <= i; i--){

            while(true){

                //System.out.println("計算前" +N);
                //System.out.println("ひく数" +cmp.get(i));
                if(cmp.get(i) < N){
                    N -= cmp.get(i);
                    ans++;
                    //System.out.println(ans+ "回");
                } else{
                    //System.out.println("引けないので次");
                    //System.out.println();
                    break;
                }
                //System.out.println("計算後" + N);
                //System.out.println();
            }
        }

        ans += N;

        System.out.println(ans);
    }
}