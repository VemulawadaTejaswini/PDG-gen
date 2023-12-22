import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    
    int counter = 0;
    
    for(int i = 0; i < s.length()/2; i ++){
      if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
        counter += 1;
      }
    }
    
    System.out.println(counter);
  }
}
