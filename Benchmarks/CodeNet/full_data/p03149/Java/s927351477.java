import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] N = new int[4];
    N[0] = sc.nextInt();
    N[1] = sc.nextInt();
    N[2] = sc.nextInt();
    N[3] = sc.nextInt();
    Arrays.sort(N);
    int[] array = {1,4,7,9};
    if(Arrays.equals(N, array)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}