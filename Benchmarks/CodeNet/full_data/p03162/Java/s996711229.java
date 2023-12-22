import java.util.Scanner;

public class Main {
    public static int max(int[][]ar, int i){
        if(ar[i][0]>=ar[i][1] && ar[i][0]>=ar[i][2]){
            return ar[i][0];
        }
        else if(ar[i][1] >= ar[i][2] && ar[i][1]>= ar[i][0]){
            return ar[i][1];
        }
        else{
            return ar[i][2];
        }
    }
    public static int max2(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{
            return c;
        }
    }
    public static int f(int[][] ar, int i){
        if(i==ar.length -1){
            return max(ar, i);
        }
        int val1 = 0;
        int val2 = 0;
        int val3= 0;
        if(ar[i][0] == max(ar,i)){
            ar[i+1][0] =0;
            val1 = ar[i][0] + f(ar, i+1);
        }
        if(ar[i][1] == max(ar,i)){
            ar[i+1][1] =0;
            val2 = ar[i][1] + f(ar, i+1);
        }
        if(ar[i][2] == max(ar,i)){
            ar[i+1][2] = 0;
            val3 = ar[i][2] + f(ar, i+1);
        }
        return max2(val1, val2, val3);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] ar = new int[n][3] ;
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                ar[i][j] = scan.nextInt();
            }
        }
        int k = f(ar, 0);
        System.out.println(k);
    }
}