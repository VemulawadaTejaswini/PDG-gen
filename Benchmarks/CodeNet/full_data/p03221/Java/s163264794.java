import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] py = new int[n+1][m+1];
        int[] p = new int[m+1];
        int[] y = new int[m+1];
        for (int i=0;i<=n;i++){
            for (int j=0;j<m+1;j++){
                py[i][j]=Integer.MAX_VALUE;
            }
        }
        for (int i=1;i<=m;i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            p[i] = j;
            y[i] = k;
            py[j][i]= k;
        }
        for (int[] t:py){
            Arrays.sort(t);
        }
        for (int i=1;i<=m;i++){
            String s1 = Integer.toString(p[i]);
            int count = 0;
            while (py[p[i]][count]!=y[i]){
                count++;
            }
            String s2 = Integer.toString(count+1);
            while (s1.length()<6){
                s1 = "0"+s1;
            }
            while (s2.length()<6){
                s2 = "0"+s2;
            }
            System.out.println(s1+s2);
        }
    }
}