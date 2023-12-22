import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean dirx = true;
        int[] a = new int[8000];
        int[] b = new int[8000];
        int aindex=0;
        int bindex=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='F') {
                sum++;
            } else {
                if(dirx) {
                    a[aindex] = 2*sum;
                    aindex++;
                    x+=sum;
                    sum=0;
                    dirx = false;
                } else {
                    b[bindex] = 2*sum;
                    bindex++;
                    y+=sum;
                    sum=0;
                    dirx = true;
                }
                sum = 0;
            }
        }
        //last remainder
        if(sum>0){
            if(dirx){
                a[aindex] = 2*sum;
                aindex++;
                x+=sum;
            } else {
                b[bindex] = 2*sum;
                bindex++;
                y+=sum;
            }
        }
        boolean xans;
        boolean yans;
        if(x<0){
            xans = false;
        } else {
            boolean[][] xdp = partialSumDP(a, 8000, x);
            xans = xdp[aindex][x];
        }
        if(y<0){
            yans = false;
        } else {
            boolean[][] ydp = partialSumDP(b, 8000, y);
            yans = ydp[bindex][y];
        }

        if(xans & yans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean[][] partialSumDP(int[] series,int length, int maxsum){
        boolean dp[][] = new boolean[length+1][maxsum+1];
        dp[0][0] = true;
        for(int i=1;i<length+1;i++){
            for(int s=0;s<maxsum+1;s++){
                if(s-series[i-1]>=0) {
                    dp[i][s] = dp[i-1][s] | dp[i-1][s-series[i-1]];
                } else {
                    dp[i][s] = dp[i-1][s];
                }
            }
        }
        return(dp);
    }
}