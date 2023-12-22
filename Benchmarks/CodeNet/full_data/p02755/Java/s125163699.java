import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int price = 0;
        boolean judge = false;
        
        for(int i=1; i<=1000; i++){
            price = i;
            if(Math.floor(price*0.08) == A && Math.floor(price*0.1) == B){
                judge = true;
                break;
            }
        }
        
        if(judge) System.out.println(price);
        else System.out.println(-1);
    }
}
