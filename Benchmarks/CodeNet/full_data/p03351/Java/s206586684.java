import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        
        int ca =Math.abs(c-a);
        int cb =Math.abs(c-b);
        int ba =Math.abs(b-a);
        
        int num1,num2=0;
        
        if(ca<=d||(cb<=d&&ba<=d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        
        
        
        
    }
    
    
}
