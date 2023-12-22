import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int c =0;
    
    for(int i=A; i<B+1; i++) {
      if(String.valueOf(i).substring(0,1).equals(String.valueOf(i).substring(4, 5)) && 
        String.valueOf(i).substring(1,2).equals(String.valueOf(i).substring(3, 4))) {
      c++;
      }
    }
      
    System.out.println(c);
  }
}