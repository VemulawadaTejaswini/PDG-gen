import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        long[] a=new long[n];
        long edge1=0,edge2=0;
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
            tm.put((int)a[i],tm.getOrDefault((int)a[i],0)+1);
        }
        while (tm.size()>1&&edge1==0){
            Map.Entry<Integer,Integer> temp=tm.pollLastEntry();
            if(temp.getValue()>1){
                edge1=temp.getKey();
            }
        }
        while (tm.size()>0&&edge2==0){
            Map.Entry<Integer,Integer> temp=tm.pollLastEntry();
            if(temp.getValue()>1){
                edge2=temp.getKey();
            }
        }
        out.println(edge1*edge2==0?-1:edge1*edge2);
    }
}