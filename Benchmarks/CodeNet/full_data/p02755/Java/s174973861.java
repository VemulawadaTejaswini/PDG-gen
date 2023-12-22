import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    for(int i = 0;i<1251;i++){
      int aa = (int)(i * 0.08);
      int bb = (int)(i * 0.1);
      if(aa == a && bb == b){
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}
