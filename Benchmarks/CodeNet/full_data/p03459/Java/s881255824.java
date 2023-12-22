import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] t = new int[n+1];
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        for(int i = 1; i <= n; i++){
            t[i] = Integer.parseInt(sc.next());
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        
        String ans = "Yes";
        for(int i = 1; i <= n; i++){
            if(t[i] - t[i-1] < Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1])){
                ans = "No";
                break;
            }
            if(t[i] % 2 != (x[i] + y[i]) % 2){
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);
    }
}