import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    
    int count =(B-1)/(A-1);
    if((B-1)%(A-1)!=0){
      count++;
    }
  
    System.out.println(count);
  
  }
 
}