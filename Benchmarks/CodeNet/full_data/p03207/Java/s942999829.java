import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int ans = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            int p = Integer.parseInt(sc.next());
            ans += p;
            if(p > max){
                max = p;
            }
        }
        ans -= max/2;
        
        System.out.println(ans);
    }
}