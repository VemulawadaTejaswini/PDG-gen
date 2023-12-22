import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        int[][] dirs=new int[n*n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                dirs[n*i+j][0]=nums[i][0]-nums[j][0];
                dirs[n*i+j][1]=nums[i][1]-nums[j][1];
            }
        }
        int ans=0;
        int[] tmp=new int[2];
        int tmpa=0;
        for(int i=0;i<dirs.length;i++){
            tmp[0]=dirs[i][0];
            tmp[1]=dirs[i][1];
            if(tmp[0]==0&&tmp[1]==0)continue;
            tmpa=0;
            for(int j=0;j<dirs.length;j++){
                if(tmp[0]==dirs[j][0]&&tmp[1]==dirs[j][1]){
                    tmpa++;
                }
            }
            ans=Math.max(ans,tmpa);
        }
        System.out.println(n-ans);
    }
}