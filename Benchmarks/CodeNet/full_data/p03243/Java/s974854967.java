import java.util.*;
class Main {
  public static void main (String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int x = scan.nextInt();
      
      int y =0;
      
      for(int i=1; i<10; i++){
        y = 111*i;
        if(y>=x){
          break;
          }
          }
         System.out.println(y);
         }
        
}