import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] candy = new int[2][n];

        for(int i=0;i<n;i++)candy[0][i]=sc.nextInt();
        for(int i=0;i<n;i++)candy[1][i]=sc.nextInt();

        int[] leftsum = new int[n];
        int[] rightsum = new int[n];

        leftsum[0]=candy[0][0];
        for(int i=1;i<n;i++){
            leftsum[i]=leftsum[i-1]+candy[0][i];
        }
        rightsum[n-1]=candy[1][n-1];
        for(int i=n-2;i>-1;i--){
            rightsum[i]=rightsum[i+1]+candy[1][i];
        }

        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,leftsum[i]+rightsum[i]);
        }
        System.out.println(ans);

    }

}


