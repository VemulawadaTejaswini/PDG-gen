import java.util.*;

public class Main{
  public Main(){}
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] tokens = scanner.nextLine().split(" +");
    
 	int m = Integer.parseInt(tokens[0]);
    int n = Integer.parseInt(tokens[1]);
    
    for(int i=0; i<n+1; i++){
      System.out.print("#");
    }
    System.out.println("#");
    
    while(scanner.hasNext()){
    	System.out.print("#");
    	System.out.print(scanner.nextLine().trim());
    	System.out.println("#");
    }
    
    for(int i=0; i<n+1; i++){
      System.out.print("#");
    }
    System.out.println("#");
  }
}