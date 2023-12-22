import java.util.*;

public class Main{
   Scanner in = new Scanner(System.in);

   void solve(){
        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            set.add(a[i]);
        }
        Arrays.sort(a);
        int c = set.size();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i = 1; i < n; i++){
            if(a[i] != a[i - 1]){
                list.add(count);
                count = 1;
            }else{
                count++;
            }
        }
        if(count == 1) list.add(1);
        //list.forEach(System.out::println);
        int ans = 0;
        list.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                return a > b ? 1 : -1;
            }
        });
        int idx = 0;
        while(c > k){
            ans += list.get(idx++);
            c--;
        }
        System.out.println(ans);
   }

   public static void main(String[] args){
       new Main().solve();    
   }
}