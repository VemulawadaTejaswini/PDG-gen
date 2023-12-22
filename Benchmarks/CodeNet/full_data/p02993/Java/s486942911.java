import java.util.Scanner;
 
public class Main {
  public static void main ( String[] args ) {
 
    Scanner code = new Scanner ( System.in );

    char[] check = code.next().toCharArray();
    
    boolean judgment = false;

    for(int i = 0; i < 3; i++){
        if(check[i] == check[i+1]){
          judgment = true;
          break;
        }
    }

    if (judgment) {
            System.out.println("bad");
        } else {
            System.out.println("Good");
        }

  }
}