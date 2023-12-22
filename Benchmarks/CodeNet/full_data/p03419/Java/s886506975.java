import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = 0;
        if(n == 1 && m == 1){
            ans = 0;
        }else if(n == 1 && m > 1){
            ans = m-2;
        }else if(n > 2){
            ans = (n-2)*(m-2);
        }
        
        System.out.println(ans);
    }
    
}