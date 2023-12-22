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
        for(int i=0;i<=n;i++){
            b[i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;j++){
                if(j==i+1){
                    b[i] += Math.abs(a[j]-a[j-2]);
                }
                else if(j!=i){
                    b[i] += Math.abs(a[j]-a[j-1]);
                }
            }
            System.out.println(b[i]);
        }
        
    }
}
