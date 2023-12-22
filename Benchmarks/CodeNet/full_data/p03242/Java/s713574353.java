import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x%10;
      	int b = (x/10)%10;
        int c = x/100;
        
         
        if(a==1 || a ==9){
          if(a==1){a = 9;}
          else{a = 1;}
        }
        if(b==1 || b ==9){
          if(b==1){b = 9;}
          else{b = 1;}
        }
        if(c==1 || c ==9){
          if(c==1){c = 9;}
          else{c = 1;}
        }
          
      System.out.print(c);
      System.out.print(b);
      System.out.print(a);
       
    }
}