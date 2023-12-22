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
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            v[i]=sc.nextInt();
            map.put(v[i], map.getOrDefault(v[i], 0)+1);
            if(i%2==0){
                mapE.put(v[i],mapE.getOrDefault(v[i], 0)+1);
            }else{
                mapO.put(v[i], mapO.getOrDefault(v[i],0)+1);
            }
        }
        if(map.get(v[0])==n){
            out.println(n/2);
            exit(0);
        }
        int Emax=0,Omax=0;
        for(int k:mapE.keySet()){
            Emax=max(Emax,mapE.get(k));
        }
        for(int k:mapO.keySet()){
            Omax=max(Omax,mapO.get(k));
        }
        int tmpE=0,tmpO=0;
        if(Emax>Omax){
            for(int k:mapE.keySet()){
                if(mapE.get(k)==Emax)tmpE=k;
            }
            Omax=0;
            for(int k:mapO.keySet()){
                if(tmpE!=k){
                    Omax=max(Omax,mapO.get(k));
                }
            }
        }else{
            for(int k:mapO.keySet()){
                if(mapO.get(k)==Omax)tmpO=k;
            }
            Emax=0;
            for(int k:mapE.keySet()){
                if(mapE.get(k)!=tmpO){
                    Emax=max(Emax,mapE.get(k));
                }
            }
        }
        out.println(n-Emax-Omax);
    }
}