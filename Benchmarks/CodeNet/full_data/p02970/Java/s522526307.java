import java.util.*;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   int d = sc.nextInt();

   int w = (n+2*d)/(2*d+1);
   System.out.println(w);
  }
}