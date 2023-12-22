import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();

    int dn = 1;
    for(int i = 0;i < d;i++){
      dn *= 100;
    }
    if(n < 100){
      System.out.println(dn * n);
    }else{
      System.out.println(dn * n + dn * 1);
    }
  }
}