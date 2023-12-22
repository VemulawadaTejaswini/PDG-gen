import java.util.Scanner;
import java.lang.Character;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    
    int sum = 0;
    for(int x = 0;x<3;x++){
      int value = Character.getNumericValue(input.charAt(x));
      sum+=value;
      
      
    }
    System.out.print(sum);
  }
}