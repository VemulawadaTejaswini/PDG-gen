
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>[] list=new List[n];
        long[][] jisuu=new long[n][2];
        for(int i=0;i<n;i++){
            jisuu[i][1]=i;
            list[i]=new ArrayList<>();
        }
        
        int tmpa;
        int tmpb;
        for(int i=0;i<n-1;i++){
            tmpa=sc.nextInt()-1;
            tmpb=sc.nextInt()-1;
            list[tmpa].add(tmpb);
            list[tmpb].add(tmpa);
            jisuu[tmpa][0]++;
            jisuu[tmpb][0]++;
        }
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        Comp comp=new Comp();
        comp.set_index(0);
        Arrays.sort(jisuu,comp);
        Arrays.sort(c);
        for(int i=0;i<n;i++){
            jisuu[i][0]=c[i];
        }
        comp.set_index(1);
        Arrays.sort(jisuu,comp);
        long ans=0;
        int size;
        for(int i=0;i<n;i++){
            size=list[i].size();
            for(int j=0;j<size;j++){
                ans+=Math.min(jisuu[i][0],jisuu[list[i].get(j)][0]);
            }
        }
        System.out.println(ans/2);
        for(int i=0;i<n;i++){
            System.out.print(jisuu[i][0]+" ");
        }
        System.out.println();
    }

}
    class Comp implements Comparator {

    int index = 0;

    void set_index (int i) {
        index = i;
    }

    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}
