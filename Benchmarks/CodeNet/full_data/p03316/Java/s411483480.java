import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String[] sn = n.split("",0);
    int sum = 0;
    for(int i = 0;i < sn.length;i++){
      sum += Integer.parseInt(sn[i]);
    }
    int ans = Integer.parseInt(n) % sum;
    if(ans == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}