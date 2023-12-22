import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] time = new int[n];
        for(int i = 0; i < n; i++){
            time[i] = sc.nextInt();
        }
        long sum = 0;
        int add = 0;
        for(int i = 0; i < n-1; i++){
            add = Math.min(t,time[i+1]-time[i]);
            sum = sum + add;
        }
        System.out.print(sum+t);
    }
}