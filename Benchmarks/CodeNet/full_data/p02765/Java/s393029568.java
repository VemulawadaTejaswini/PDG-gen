import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            int N=sc.nextInt();
            int X[] =new int[N];
            int total=0;
            for(int i=0;i<N;i++){
                X[i]=sc.nextInt();
                total+=X[i];
            }
            long C = Math.round((double)total/N);
            int ans=0;
            
            for(int j=0;j<N;j++){
                ans += Math.pow(X[j]-C, 2);
            }
        
        System.out.println(ans);
    }
}
