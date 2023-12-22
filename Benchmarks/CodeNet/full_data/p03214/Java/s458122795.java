import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int[N];
        double [] b = new double [N];
        int sum =0;
        int ans =0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        
        double ave = sum/N;
        
        for(int i=0; i<N; i++){
            if(a[i]>=ave){
                b[i] = a[i] - ave;
            }else{
                b[i] = ave - a[i];
            }
        }
        
        double min =b[0];
        for(int i=1; i<N; i++){
            if(min>b[i]){
                ans = i;
                min = b[i];
            }
        }
        
        
        System.out.println(ans);
        
    }
}