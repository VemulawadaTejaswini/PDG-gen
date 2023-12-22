import java.util.*;

public class Main{
   Scanner in = new Scanner(System.in);

   void solve(){
        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        ArrayList<Integer> list = new ArrayList<>();
        int count  = 1;
        for(int i = 1; i < n; i++){
            if(a[i] != a[i - 1]){
                list.add(count);
                count = 1;
            }else{
                count++;
            }
        }
        if(count == 1) list.add(1);
        list.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                return a > b ? 1 : -1;
            }
        });
        int size = list.size();
        int ans = 0, idx = 0;
        while(size > k && idx < list.size()){
            ans += list.get(idx++);
            size--;
        }
        System.out.println(ans);
   }

   public static void main(String[] args){
       new Main().solve();    
   }
}