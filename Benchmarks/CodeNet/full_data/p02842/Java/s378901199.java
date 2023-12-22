import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int price = 0;
        boolean judge = false;
        
        for(int i=927; i>0; i--){
            price = i;
            if(Math.floor(price*1.08) == N){
                judge = true;
                break;
            }
        }
        
        if(judge) System.out.println(price);
        else System.out.println(":(");
        
    }
}
