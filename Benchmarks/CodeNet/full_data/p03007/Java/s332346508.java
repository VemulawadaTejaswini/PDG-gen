import java.util.*;
import java.lang.Math;;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> natural = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        for(int i=0;i<n;i++){
            int m = Integer.parseInt(sc.next());
            if(m<0){
                minus.add(m);
            }else{
                natural.add(m);
            }
        }
        sc.close();
        List<int[]> q = new ArrayList<>();
        int ans;
        if(minus.size() > 0){
            int x = minus.get(0);
            for(int i=0;i<natural.size();i++){
                int y = natural.get(i);
                if(i < natural.size() - 1){
                    int[] query = {x,y};
                    q.add(query);
                    x -= y;
                }else{
                    int[] query = {y,x};
                    q.add(query);
                    x = y-x;
                }
            }
            for(int i=1;i<minus.size()-1;i++){
                int y = minus.get(i);
                int[] query = {x,y};
                q.add(query);
                x -= y;
            }
            ans = x;
        }else{
            int x = natural.get(0);
            for(int i=1;i<natural.size();i++){
                int y = natural.get(i);
                if(i < natural.size() - 1){
                    int[] query = {x,y};
                    q.add(query);
                    x -= y;
                }else{
                    int[] query = {y,x};
                    q.add(query);
                    x = y-x;
                }
            }
            ans = x;
        }
        System.out.println(ans);
        for(int[] v : q){
            System.out.println(v[0] + " " + v[1]);
        }
    }
}