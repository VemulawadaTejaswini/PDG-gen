import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        for(int i=0; i<19; i++){
            if(s.charAt(i)==','){
                System.out.print(" ");
            }else{
                System.out.print(s.charAt(i));
            }
        }
        
   }
}
