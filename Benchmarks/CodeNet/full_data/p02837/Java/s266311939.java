import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[][] x = new int[n][];
        int[][] y = new int[n][];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            x[i] = new int[a[i]];
            y[i] = new int[a[i]];
            for (int j=0;j<a[i];j++){
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i=0;i<Math.pow(2,n);i++){
            String s = Integer.toBinaryString(i);
            while (s.length()<n){
                s = "0"+s;
            }
            int[] tf = new int[n];
            int count = 0;
            for (int j=0;j<n;j++){
                if (s.charAt(j)=='0')tf[j]=0;
                if (s.charAt(j)=='1'){
                    tf[j]=1;
                    count++;
                }
            }
            boolean b = true;
            for (int j=0;j<n&&b;j++){
                if (tf[j]==1){
                    for (int k=0;k<a[j]&&b;k++){
                        if (y[j][k]!=tf[x[j][k]-1])b=false;
                    }
                }
            }
            if (b){
                max = Math.max(max,count);
            }

        }
        System.out.println(max);
    }
}