import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String enki = sc.next();
        
        if(enki.equals("A")){
            System.out.println("T");
            
        }else if(enki.equals("T")){
            System.out.println("A");
            
        }else if(enki.equals("G")){
            System.out.println("C");
            
        }else if(enki.equals("C")){
            System.out.println("G");
        }
        
    }
}
