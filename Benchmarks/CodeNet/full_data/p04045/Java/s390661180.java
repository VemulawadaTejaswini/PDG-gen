import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int n=String.valueOf(N).length();
        int K=sc.nextInt();
        int ans=0;
        boolean[] D=new boolean[10];
        Arrays.fill(D,false);
        for(int i=0;i<K;i++){
            D[sc.nextInt()]=true;
        }
        lavel:for(int i=N;;i++){
            for(int j=0;j<n;j++){
                if(D[i/(int)Math.pow(10, j)%10]){
                    continue lavel;
                }
            }
                 System.out.println(i);
                 return;
        }
    }
}