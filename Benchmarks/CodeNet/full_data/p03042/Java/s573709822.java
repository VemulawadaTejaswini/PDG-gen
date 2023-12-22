import java.util.*;
class Main{
     public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int S=sc.nextInt();
        if(S<0){
                System.out.println("NA");
                return;
            }
        if(S%100<13&&S%100!=0){
            
            if(S/100<13&&S/100!=0){
                System.out.println("AMBIGUOUS");
                return;
            }
            System.out.println("YYMM");
            return;
        }
        if(S/100<13&&S/100!=0){
            System.out.println("MMYY");
        
            return;
        }
        System.out.println("NA");
        
        
        
        
        
     }
}