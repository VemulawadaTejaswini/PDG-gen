import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i = 105; i <= n; i += 2){
            int count = 0;
            for(int j = 1; j <= n; j++){
                if(i % j == 0) count++;
            }
            if(count == 8) ans++;
        }
        
        System.out.println(ans);
    }
}