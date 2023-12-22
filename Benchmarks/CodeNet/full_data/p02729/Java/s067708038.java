import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        long ans = 0;
        if(n >= 2){
            ans += (n * (n-1)) / 2;
        }
        if(m >= 2){
            ans += (m * (m-1)) / 2;
        }
        System.out.println(ans);
    }
}