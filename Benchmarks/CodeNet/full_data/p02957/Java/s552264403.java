import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
 
      if((B-A)%2==0){
    System.out.println(((B-A)/2)+A);
      }else{
	System.out.println("IMPOSSIBLE");
      }
      }
}
