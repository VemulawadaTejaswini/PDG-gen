import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        
        int br=b+r;
        if(br >0){
                
            int sum=(n/br);
            sum *= b;
            int rest=n%br;
            if(rest>b) sum+=b;
            else sum+=rest;
            
            
            //String s = sc.next();
            System.out.println(sum);
        }else{
            System.out.println(0);
        }
    }
    
}