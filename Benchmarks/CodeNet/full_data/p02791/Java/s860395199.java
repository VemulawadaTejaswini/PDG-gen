import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        int ans=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] p = new int[n];
        HashSet<Integer> ff = new HashSet<>();

        for(int i=0;i<n;i++)p[i]=sc.nextInt();

        for(int i=0;i<n;i++){
            boolean ok=true;

            for(int j=0;j<i;j++){
                if(p[i]<p[i-1]&&ff.contains(i))break;
                if(p[i]>p[j]){
                    ok=false;
                    break;
                }

            }
            if(ok){
                ans++;
                ff.add(i);
            }
        }


        System.out.println(ans);

    }

}
