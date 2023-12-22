import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int coinNumber = 0;
        
        for(int i = 0; i < 2; i++){
            if(a > b){
                coinNumber += a;
                a--;
            }else{
                coinNumber += b;
                b--;
            }
        }
        
        System.out.println(coinNumber);
        
    }
}
