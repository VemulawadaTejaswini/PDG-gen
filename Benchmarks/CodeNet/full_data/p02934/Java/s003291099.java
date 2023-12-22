import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    double d = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      d += (double)1/n;
    }
    System.out.println(1/d);
  }
}