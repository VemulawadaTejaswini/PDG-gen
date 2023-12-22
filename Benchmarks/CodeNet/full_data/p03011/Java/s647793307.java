import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] pqr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
    Arrays.sort(pqr);
    System.out.println(pqr[0]+pqr[1]);
  }
}