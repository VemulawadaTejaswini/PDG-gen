import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int x = sc.nextInt();

    for(int i = k; i > 0; i--){
      System.out.print((x - i + 1) + " ");
    }

    for(int i = 1; i < k; i++){
      System.out.print((x + i) + " ");
    }
  }
}
