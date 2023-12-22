import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] x=new int[3];
        x[0]=sc.nextInt();
        x[1]=sc.nextInt();
        x[2]=sc.nextInt();
        
        Arrays.sort(x);
        
        int ans=0;
        
        if((x[2]*2-x[1]-x[0])%2!=0){
            x[0]++;
            x[2]++;
            ans++;
        }
        
        ans += (x[2]*2-x[1]-x[0])/2;
        System.out.println(ans);
    }
}
