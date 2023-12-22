import java.util.*;
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int k;
  int a = sc.nextInt();
  int b = sc.nextInt();
  int ak = Math.abs(a-k);
  int bk = Math.abs(b-k);
  if(ak==bk){
    System.out.println(k);
  }else{
    System.out.println("IMPOSSIBLE");
  }
 }
}