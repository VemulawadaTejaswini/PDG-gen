import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int sum = 0;

    for(int i = 0; i < 8; i++){
      sum += N % 10;
      N = N / 10;
      if(N == 0){
        break;
      }
    }
    String output = null;
    
    if(N % sum == 0){
      output = "Yes";
    }
    else
    {
      output = "No";
    }
            
    System.out.println(output);
  }
}