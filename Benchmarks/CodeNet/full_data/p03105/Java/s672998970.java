import java.util.*;
public class Main {

    public static void main(String[] args) {
     
        Scanner entrada=new Scanner(System.in);
        int A=entrada.nextInt();
        int B=entrada.nextInt();
        int C=entrada.nextInt();
       int variable=A;
       int count=1;
       
     if(A<=B){
        while(variable<B){
            variable+=A;  
            count++;
            System.out.println(variable);
        }
    
       if(count>=C){
           System.out.println(C);
           
       }else if(count<C){
           System.out.println(count);
       }
     }else if(A>B){
         System.out.println("0");
     }     
    
        
    }
    
}
