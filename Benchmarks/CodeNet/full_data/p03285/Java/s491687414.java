import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int cake = 4;
    int donatu = 7;
    
      
      for(int i=0 ; i<=25; i++){
          
          int total = 0;
        
        for(int j=0 ; j<=9; j++){
          
          total +=  cake*i+donatu*j;      
           if(total==n){
          System.out.println("Yes");
          return;
        }
      }
     
    }
    System.out.println("No");
  }
}