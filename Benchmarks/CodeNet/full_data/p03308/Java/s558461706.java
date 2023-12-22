import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    int max = 0, min = 1000000000;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      max = n > max ? n : max;
      min = n < min ? n : min;
    }
    
    System.out.println(max - min);
  }
}