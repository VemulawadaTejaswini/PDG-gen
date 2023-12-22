import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=1;
        int x =a ;
        int t =a;
        if(a >=b)System.out.println("1");
        
        else{    for(int i = a ; i<=a*a ;i+=a ){
            
            if(i<b){
                t--;
                count++;
            }
            else break;
          
      } if(b%x>t){
            count++;
         } 
      
        
        System.out.println(count);
        }
    /*   else { while(a<b){
           
            a=a+a;
            count++;   
         } 
         
        
       System.out.println(count);
        }
      */
    }
  
}
