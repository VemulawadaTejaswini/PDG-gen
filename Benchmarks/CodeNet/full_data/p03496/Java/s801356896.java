import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int completed = 0;
        int count = 0;
        ArrayList<String> ans = new ArrayList<String>();
        while(completed < n-1){
            if(a[completed+1] >= a[completed]) completed++;
            else{
                count++;
                a[completed+1] += Math.abs(a[completed]);
                ans.add( String.valueOf(completed+2) + " " + String.valueOf(completed+1) );
            }
        }

        System.out.println(count);
        for(String s : ans){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
