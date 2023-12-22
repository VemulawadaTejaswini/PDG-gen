import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static int MOD=1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m==1){
            out.println(1);
        }else{
            HashMap<Integer,Integer> map=new HashMap<>();
            int Stop=(int)(sqrt(m)+1);
            int ArrMax=0;
            for (int i = 2; i <= Stop; i++) {
                while(m%i==0){
                    m/=i;
                    map.put(i,map.getOrDefault(i, 0)+1);
                    ArrMax=max(ArrMax,map.get(i));
                }
            }
            if(map.isEmpty()){map.put(m, 1);}
            int[][] comb=new int[ArrMax+n][ArrMax+n];
            comb[0][0]=1;
            for (int i = 1; i <ArrMax+n ; i++) {
                for (int j = 0; j < ArrMax+n; j++) {
                    if(j!=0){comb[i][j]=(comb[i-1][j-1]+comb[i-1][j])%MOD;}else{comb[i][j]=comb[i-1][j]%MOD;}
                }
            }
            int ans=1;
            for(int k:map.keySet()){ans=(ans*comb[n-1+map.get(k)][n-1])%MOD;}
            out.println(ans);
        }
    }
}