import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] v=new int[n];
        HashMap<Integer,Integer> mapE=new HashMap<>();
        HashMap<Integer,Integer> mapO=new HashMap<>();
        for (int i = 0; i < n; i++) {
            v[i]=sc.nextInt();
            if(i%2==0){
                mapE.put(v[i],mapE.getOrDefault(v[i], 0)+1);
            }else{
                mapO.put(v[i], mapO.getOrDefault(v[i],0)+1);
            }
        }
        int Emax=0,Omax=0;
        for(int k:mapE.keySet()){
            Emax=max(Emax,mapE.get(k));
        }
        for(int k:mapO.keySet()){
            Omax=max(Omax,mapO.get(k));
        }
        int ans=n-Omax-Emax;
        if(ans==0&&v[0]==v[1]){
            ans=n/2;
        }
        out.println(ans);
    }
}