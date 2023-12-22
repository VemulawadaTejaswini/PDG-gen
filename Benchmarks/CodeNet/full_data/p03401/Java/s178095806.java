import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+2];
        a[0] = 0;
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        a[n+1] = 0;
        int[] b = new int[n+1];
        int sum = 0;
        for(int i=0;i<=n;i++){
            b[i] = 0;
            sum += Math.abs(a[i+1]-a[i]);
        }
        for(int i=1;i<=n;i++){
            b[i] = sum - Math.abs(a[i]-a[i-1]) - Math.abs(a[i+1]-a[i]) 
                    + Math.abs(a[i+1]-a[i-1]);
            System.out.println(b[i]);
        }
        
    }
}