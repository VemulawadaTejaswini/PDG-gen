import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        HashMap<Integer,Long> factor=new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int temp=i;
            int s=(int)sqrt(i)+1;
            for (int j = 2; j <= s; j++) {
                while (temp%j==0){
                    factor.put(j,factor.getOrDefault(j,0l)+1);
                    temp/=j;
                }
            }
            if(temp!=1)factor.put(temp,factor.getOrDefault(temp,0l)+1);
        }
        long ans=1;
        for (Integer k:factor.keySet()){
            ans=(ans*(factor.get(k)+1))%(long)(1e9+7);
        }
        out.println(ans);
    }
}