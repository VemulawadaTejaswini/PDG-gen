import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int count = 0;
        
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(sc.next());
            while(0 < a && a%2 == 0){
                a /= 2;
                count++;
                
            }
            
        }
        System.out.println(count);
        
    }
}