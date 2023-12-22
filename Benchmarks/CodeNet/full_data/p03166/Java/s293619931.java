import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0;i<m;i++){
            int temp1 = in.nextInt();
            int temp2 = in.nextInt();
            mat[temp1-1][temp2-1] = 1;
        }
        int max = 0;
      //  System.out.println(go(mat,0,0));
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
            int temp = go(mat,i,0,vis);
            //System.out.println(i+" "+temp+" ");
            max = Math.max(max,temp);
            }
        }
        System.out.println(max);

    }
    static int go(int mat[][],int curr,int level,boolean vis[]){
       // System.out.println("Curr = "+curr+" "+level);
        int currL = level;
       for(int i=0;i<mat[curr].length;i++){
           if(mat[curr][i]==1){
               level = Math.max(level,go(mat,i,currL+1,vis));
           }
       }
        vis[curr] = true;
        return level;
    }

}