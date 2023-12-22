import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = scan.nextInt();
        }
        for(int i = n - 1; i > 0; i--){
            if(h[i - 1] - h[i] <= 0){
                
            }else if(h[i - 1] - h[i] <= 1){
                h[i - 1]--;
            }else{
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}