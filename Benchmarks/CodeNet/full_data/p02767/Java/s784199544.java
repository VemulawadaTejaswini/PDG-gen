import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++) x[i] = scan.nextInt();
        int sum = 0;
        int out = Integer.MAX_VALUE;
        for(int i = 1; i <= 100; i++){
            for(int j = 0; j < n; j++){
                sum += Math.pow(x[j] - i, 2);
            }
            out = Math.min(sum, out);
            sum = 0;
        }
        System.out.println(out);
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
