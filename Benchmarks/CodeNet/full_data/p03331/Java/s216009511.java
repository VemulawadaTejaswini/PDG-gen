import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int min=-1;
    for(int A=0; A<=N/2;A++){
      
      int sum=0;

      String Astr = Integer.toString(A);
      for(int i=0;i<Astr.length();i++){
        sum += Integer.parseInt(Astr);
      }
      String Bstr = Integer.toString(N-A);
      for(int i=0;i<Bstr.length();i++){
        sum += Integer.parseInt(Bstr);
      }
        
      min = (min==-1 ? sum : Math.min(min,sum));
    }
    
    System.out.println(min);
  }
}
    
      
      
    
  