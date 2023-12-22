import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] flag = new int[n+1][n+1];
        //Arrays.fill(flag[][],false);
        int[] num = new int[n+1];

        for(int i =0;i<m;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                flag[a][b]++;
                flag[b][a]++;
        }

        for(int i  =1;i<n+1;i++){
            for(int j =1;j<n+1;j++){
                num[i]+=flag[i][j];
            }
            System.out.println(num[i]);
        }
    }
}




