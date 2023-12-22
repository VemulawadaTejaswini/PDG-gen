import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            String plusMinus = sc.next();
            int ans = 0;

            for(int i = 0; i < plusMinus.length(); i++){
                String str = plusMinus.substring(i, i + 1);
                if(str.equals("+")) ans++;
                else ans--;
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}