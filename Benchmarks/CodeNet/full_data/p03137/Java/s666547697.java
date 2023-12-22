import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] x = new int[m];
        for(int i=0;i<m;i++) x[i]=sc.nextInt();
        Arrays.sort(x);
        int ans = help(n,m,x);
        System.out.println(ans);
    }
    static int help(int n, int m, int[] x){
        if(n>=m) return 0;
        int[] dif = new int[m-1];
        for(int i=0;i<m-1;i++) dif[i]=x[i+1]-x[i];
        int sum = 0;
        Arrays.sort(dif);
        for(int i=0;i<m-n;i++) sum+=dif[i];
        return sum;
    }
}
