import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt() - 1;
        int out = 0;
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0; !c.contains(i); i = a[i]){
            if(i == 1){
                System.out.println(out);
                return;
            }
            c.add(i);
            out++;
        }
        System.out.println(-1);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
