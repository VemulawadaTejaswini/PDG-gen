import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0, sum = 0;
    for(int i = 0; i < N; i++){
      int tmp = sc.nextInt();
      max = max > tmp ? max : tmp;
      sum += tmp;
    }
    if(max < sum - max){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}