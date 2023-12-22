import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] val = new int[N];
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(val);
    System.out.println(val[N-1]-val[0]);
  }
}