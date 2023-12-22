import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rate = sc.nextInt();
        int deduction = sc.nextInt();
        int ans = sc.nextInt();
        for( int i = 0; i < 10; i++){
            ans = ans*rate - deduction; 
        }
    
    }
}
