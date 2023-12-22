
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(sc.nextInt());
            tmp.add(sc.nextInt());
            a.add(tmp);
        }
        a.sort((x,y)->y.get(1)-x.get(1));
        a.sort((x,y)->x.get(0)-y.get(0));

        int sal = 0;
        for(int i=1;i<m+1;i++){
            int sub_end = n+1;
            for(int j=0;j<a.size();j++){
                if(a.get(j).get(0)>i){
                    sub_end = j;
                }
            }
            if(sub_end==n+1)continue;
            int index = 0;
            int max = 0;
            for(int j=0;j<sub_end;j++){
                int t = a.get(j).get(1);
                if(max<t){
                    max = t;
                    index = j;
                }
            }
            sal += max;
            a.remove(index);
        }
        System.out.println(sal);
        return;
    }
}