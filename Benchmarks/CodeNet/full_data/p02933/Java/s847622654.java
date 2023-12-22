import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        String s = scan.next();
        
        if(a1 >= 3200){
            System.out.println(s);
        }else{
            System.out.println("Red");
        }
        
        
    }
}