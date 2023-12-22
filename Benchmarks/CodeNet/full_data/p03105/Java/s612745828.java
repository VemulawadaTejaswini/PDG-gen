import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());

            int ans = 0;
            while(a <= b && c != 0 && b != 0){
                b -= a;
                c--;
                ans++;
            }

            System.out.println(ans);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}