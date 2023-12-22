import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();  
    int i = 1;
    int j = 1;
    int a = 1;
    
   do{
      if(n % a == 0){
        i = a;
        j = n/i;
      }
      a++;
    } while(a <= n / a);
    System.out.println(i + j -2);
  }
}
