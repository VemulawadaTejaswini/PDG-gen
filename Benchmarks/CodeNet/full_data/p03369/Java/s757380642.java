import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int y = 700;
    char[] c = scanner.nextLine().toCharArray();
    
    for(int i = 0; i < c.length; i++){
      if(c[i] == 'o'){
        y = y + 100;
      }
    }
    
    System.out.println(y);
    scanner.close();
  }
}