import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[n];
        Boolean[] hasRed = new Boolean[n];

        for(int i=0;i<n;i++){
            count[i]=1;
            hasRed[i]=false;
        }
        hasRed[0]=true;

        for(int i=0;i<m;i++){
            int x = sc.nextInt()-1;
            int y=sc.nextInt()-1;
            if(count[x]==1&&hasRed[x]){
                hasRed[x]=false;
                hasRed[y]=true;
            }else if(hasRed[x]){
                hasRed[y]=true;
            }
            count[x]--;
            count[y]++;

        }

        int ans =0;
        for(int i=0;i<n;i++)if(hasRed[i])ans++;
        System.out.println(ans);


    }
}


