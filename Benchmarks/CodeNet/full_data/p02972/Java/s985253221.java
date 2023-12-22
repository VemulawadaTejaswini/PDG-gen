import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    ArrayList<Integer>[] tree;
    long ans = 1;
    int n,k;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1], b = new int[n+1], c = new int[n+1];
        for(int i=1;i<=n;i++) a[i]=sc.nextInt();
        int midStart = n/2+1;
        for(int i=midStart;i<=n;i++){
            if(a[i]==0) b[i] = 0;
            else b[i] = 1;
        }
        for(int i=midStart-1;i>=1;i--){
            int sum = 0;
            for(int j=2*i;j<=n;j+=i) sum += b[i];
            if(sum%2!=a[i]) b[i] = 1; // otherwise no need to change status quo
        }
        List<Integer> ans = new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(b[i]>0) ans.add(i);
        }
        out.println(ans.size());
        for(int i:ans){
            out.println(String.format("%d ",i));
        }
        out.flush();
        System.exit(0);
        return -1;
    }
}