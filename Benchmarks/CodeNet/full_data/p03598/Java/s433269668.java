import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        int dist = 0;
        for(int i = 0; i < n; i++){
            dist = dist + Math.min(x[i],Math.abs(k-x[i]));
        }
        System.out.print(dist*2);
    }
}