import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        sc.close();

        if(A.length() > B.length()){
            System.out.println("GREATER");
            return;
        } else if(A.length() < B.length()){
            System.out.println("LESS");
            return;
        } else {
            for(int i = 0; i <= A.length(); i++){
                if((int)A.charAt(i) > B.charAt(i)){
                    System.out.println("GREATER");
                    return;
                } else if((int)A.charAt(i) < B.charAt(i)){
                    System.out.println("LESS");
                    return;
                }
            }
            System.out.println("EQUAL");
        }
    }
}