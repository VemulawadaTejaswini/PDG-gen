import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<Integer>();
        //ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int ans = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int l = sc.nextInt();
            li.add(x);
            map.put(x,l);
        }
        Collections.sort(li);
        int i = 0;
        int left = 0;
        int right = 0;
        for(int v: li){
            if(i == 0){
                left = v-map.get(v);
                right = v+map.get(v);
                ans++;
                //System.out.println(left+" "+right);
            }else{
                int nl = v-map.get(v);
                int nr = v+map.get(v);
                //System.out.println(nl+" "+nr);
                if(nl-right >= 0){
                    ans++;
                    left = nl;
                    right = nr;
                }else if(nl-right < 0 && nr-right >= 0){
                    continue;
                }else if(nl-right < 0 && nr-right < 0){
                    right = nr;
                }
            }
            i++;
        }
        System.out.println(ans);
    }
}
 