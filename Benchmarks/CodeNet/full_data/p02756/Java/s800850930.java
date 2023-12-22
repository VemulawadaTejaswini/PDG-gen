
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    String s = cin.nextLine();
    int n = cin.nextInt();
    Boolean mark = false;
    for (int i=0;i<n;i++) {
      int q = cin.nextInt();
      if (q==1) {
        mark = !mark;
      }
      else if (q==2) {
        int f = cin.nextInt();
        String c = cin.next();
        if (f==1&&!mark){
          s = c+s;
        }
        else if (f==1&&mark){
          s = s+c;
        }
        else if (f==2&&!mark){
          s = s+c;
        }
        else if (f==2&&mark){
          s = c+s;
        }
      }
    }
    if (mark){
      StringBuilder input1 = new StringBuilder(); 
  
      // append a string into StringBuilder input1 
      input1.append(s); 

      // reverse StringBuilder input1 
      input1 = input1.reverse(); 
      s = input1.toString();
    }

    System.out.println(s);
  }

}
