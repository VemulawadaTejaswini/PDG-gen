import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    Integer Haiku[] = new Integer[3];
    int sum = 0;
    
    for(int i = 0; i < Haiku.length; i++){
      Haiku[i] = scanner.nextInt();
      sum += Haiku[i];
    }
    
    String ans = "NO";
    
    if(sum == 17 && Arrays.asList(Haiku).contains(5) && Arrays.asList(Haiku).contains(7)){
      ans = "YES";
    }
    System.out.println(ans); 
  }
}