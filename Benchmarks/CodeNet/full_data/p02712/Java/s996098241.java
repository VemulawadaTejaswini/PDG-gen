import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            long ans = 0;

            for(int i = 1; i <= n; i++){
                if(i % 3 != 0 && i % 5 != 0){
                    ans += i;
                }
            }

            System.out.println(ans);
            

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}