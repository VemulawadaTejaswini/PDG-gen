import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int [] v = new int[n];
        for(int i =0;i < n;i++){
            v[i] = scan.nextInt();
        }
        for(int i = 0;i < n-1;i++){
            for(int t = 0;t < n-1-i;   t++){
                if(v[t] > v[t+1]){
                    int keep = v[t];
                    v[t] = v[t+1];
                    v[t+1] = keep;
                }
            }
        }
        double ans = (double)v[0];
        for(int i = 1; i < n;i++) {
        	ans = (ans + (double)v[i]) / 2.0;
        }
        System.out.println(ans);
    }
}
