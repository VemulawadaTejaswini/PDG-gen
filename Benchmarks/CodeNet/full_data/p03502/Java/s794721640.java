import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String N = sc.next();
    int sum = 0;
 
    for(int i = 0; i <= N.length(); i++){
      sum += Integer.parseInt(N.subString(i, i+1));
    }
    
    int total = Integer.parseInt(N);
    String output = null;
    
    output = (total % sum == 0) ? "Yes":"No";
    System.out.println(output);
  }
}