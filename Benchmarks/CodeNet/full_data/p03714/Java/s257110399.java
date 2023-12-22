import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        TreeMap<Integer,Integer> Left=new TreeMap<>();
        TreeMap<Integer,Integer> Right=new TreeMap<>();
        int n=sc.nextInt();
        int[] a=new int[n*3];
        long sumL=0,sumR=0;
        for (int i = 0; i < 3*n; i++) {
            a[i]=sc.nextInt();
            if(i<n){
                sumL+=a[i];
                Left.put(a[i],Left.getOrDefault(a[i],0)+1);
            }
            if(i>=2*n){
                sumR+=a[i];
                Right.put(a[i],Right.getOrDefault(a[i],0)+1);
            }
        }
        long ans=sumL-sumR,temp=ans;
        for (int i = n; i <2*n; i++) {
           // out.println(Left);//?????????????????????
            long temp1=0,temp2=0,tL=sumL,tR=sumR;
          //  out.println(Left);//?????????????
            int keyL=getMIN(Left);
            out.println("!"+Left);
            int keyR=getMAX(Right);
            if(keyL<a[i]){
                temp1=temp-keyL+a[i];
            }
            if(keyR>a[i]){
                temp2=temp-keyR+a[i];
            }
            //out.println(Left);//?????????????
            if(temp1>temp2){
                sumL=sumL-keyL+a[i];
                temp=temp1;
             //   out.println(keyL);//?????????????
               // out.println(Left);//?????????????
                Left.put(keyL,Left.get(keyL)-1);
                if(Left.get(keyL)==0)Left.remove(keyL);
            }else {
                sumR=sumR-keyR+a[i];
                temp=temp2;
                Right.put(keyR,Right.get(keyR)-1);
                if(Right.get(keyR)==0)Right.remove(keyR);
            }
        }
        out.println(max(ans,temp));
    }
    static int getMIN(TreeMap<Integer,Integer> tm){
        if(tm.pollFirstEntry().getValue()>0)return tm.pollFirstEntry().getKey();
        TreeMap<Integer,Integer> tmm=(TreeMap<Integer, Integer>) tm;
        tmm.remove(tm.pollFirstEntry().getKey());
        return tmm.pollFirstEntry().getKey();
    }
    static int getMAX(TreeMap<Integer,Integer> tm){
        if(tm.pollLastEntry().getValue()>0)return tm.pollLastEntry().getKey();
        TreeMap<Integer,Integer> tmm=(TreeMap<Integer, Integer>) tm.clone();
        tmm.remove(tm.pollLastEntry().getKey());
        return tmm.pollLastEntry().getKey();
    }
}