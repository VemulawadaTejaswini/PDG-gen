import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    int sum = 0;
    for(int i = 0; i < N; i++){
      int tmp = sc.nextInt();
      max = max > tmp ? max : tmp;
      sum += tmp;
    }
    
    System.out.println(sum - max / 2);
  }
}
    