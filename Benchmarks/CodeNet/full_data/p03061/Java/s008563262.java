import java.util.*;
import java.io.*;

public class Main {

    private static Long solver(int N, ArrayList<Long> a){

        a.sort(null);
        if(a.size() == 2){
            return a.get(1);
        }

        ArrayList<Long> smallArray = new ArrayList<Long>();
        for (int i = 0; i < 2; i++) {
            smallArray.add(a.get(i));
        }

        // 最小値との最大公約数
        Long divMaxLow= 0l;
        for (int i = 0; i < a.get(0); i++) {
            Long div = a.get(0) - i;
            if(a.get(0)%div == 0&& a.get(2)%div == 0){
                divMaxLow = div;
                break;
            }
        }

        // 最小値との最大公約数
        Long divMaxHigh= 0l;
        for (int i = 0; i < a.get(1); i++) {
            Long div = a.get(1) - i;
            if(a.get(1)%div == 0&& a.get(2)%div == 0){
                divMaxHigh = div;
                break;
            }
        }

        Long base=0l;
        if(divMaxLow > divMaxHigh){
            base = a.get(0);
            a.set(1, a.get(0));
        }else{
            base = a.get(1);
            a.set(0, a.get(1));
        }

//        System.out.println("base:"+base);

        for (int b = 0; base-b > 0; b++) {
            boolean flag=true;
            for (int i = 0; i < N; i++) {
//                System.out.println("base:"+(base-b)+" ai:"+a.get(i));
                if(a.get(i)%(base-b) !=0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                return base-b;
        }
        return 1l;

//        Map<Long, Integer> m = new HashMap<Long, Integer>();
//
//        for (int i = 0; i < N; i++) {
//            if(a[i]>max)
//                max = a[i];
//            for (Long j = 2l; j < a[i]; j++) {
//                if(a[i]%j==0){
//                    if(m.containsKey(j)){
//                        m.put(j, m.get(j)+1);
//                    }else{
//                        m.put(j, 1);
//                    }
//                }
//            }
//        }
//
//        for (Long i = 0l; i < max; i++) {
//            if(m.containsKey(max-i)) {
//                System.out.println(max - i + ":" + m.get(max - i));
//                if (m.get(max - i) >= N - 1) {
//                    return max - i;
//                }
//            }
//        }
//
//        return 0l;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = in.nextInt();
        ArrayList<Long> a = new ArrayList<Long>();
        for (int i = 0; i < N; i++) {
            a.add(in.nextLong());
        }
        System.out.println(solver(N, a));
    }
}
