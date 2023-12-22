import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int min = 1000000;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      int count = 0;
      while(n%2 == 0){
        n /= 2;
        count++;
      }
      min = min > count ? count : min;
    }
    System.out.println(min);
  }
}