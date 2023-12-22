
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[]  = new int[n-1];        
        for(int i = 0;i < n-1;i++){
            num[i]  = sc.nextInt();
        }
        int ans = num[0];
        for(int i = 0;i < n-2;i++){
            ans += min(num[i],num[i+1]);
        }
        ans += num[n-2];
        System.out.print(ans);
    }
    static int min(int a,int b){
        if(a>b)return b;
        return a;
    }
    
}
