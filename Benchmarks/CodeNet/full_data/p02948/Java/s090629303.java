
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(p);tmp.add(q);
            a.add(tmp);
        }
        a.sort((x,y)->x.get(0)-y.get(0));
        int sal = 0;
        List<Integer> subl = new ArrayList<>();
        for(int i=1;i<m+1;i++){
            while(!a.isEmpty() && a.get(0).get(0)<=i){
                subl.add(a.remove(0).get(1));
            }
            if(subl.isEmpty())continue;
            int index = subl.indexOf(Collections.max(subl));
            sal += subl.remove(index);
        }
        System.out.println(sal);
        return;
    }
}