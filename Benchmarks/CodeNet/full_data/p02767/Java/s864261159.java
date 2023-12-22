import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int maxx = 0;
        int minx = 101;
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
            if(x[i] > maxx){
                maxx = x[i];
            }
            if(x[i] < minx){
                minx = x[i];
            }
        }
        int min = 0;
        int out = Integer.MAX_VALUE;
        for(int i = minx; i <= maxx; i++){
            for(int j = 0; j < n; j++){
                min += Math.pow(x[j] - i, 2);
            }
            if(out > min){
                out = min;
            }
            min = 0;
        }
        System.out.println(out);
    }
}