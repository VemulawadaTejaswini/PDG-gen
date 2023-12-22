import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        int D[] =new int[N];
        Map<Integer,Integer> m = new HashMap<>();

        for (int i=0;i<N;i++){
//            D[i] = sc.nextInt();
            int v;
            int tmp = sc.nextInt();
            if(m.containsKey(tmp)){
                v = m.get(tmp) + 1;
            }else{
                v = 1;
            }
            m.put(tmp,v);
        }
        Object[] mapkey = m.keySet().toArray();
        Arrays.sort(mapkey);
        long result = 1;
        int prev = 0;
        if(!m.containsKey(0)||m.get(0)>1){
            System.out.println(0);
        }else{
            m.remove(0);
            for(Integer nkey:m.keySet()){
                if (prev==0){
                }else{
//                    for(int i =0;i<m.get(nkey);i++){
//                        result*=(long)prev%998244353;
//                    }
                    result = (result * (long)Math.pow(prev,m.get(nkey)))%998244353;
                }
                prev=m.get(nkey);
//                System.out.println(result);
            }
            System.out.print(result);
        }
    }
}
