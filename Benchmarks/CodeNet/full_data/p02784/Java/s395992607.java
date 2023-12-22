import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int total = 0;
    for(int i = 0;i<n;i++){
      total += sc.nextInt();
    }
    String ans;
    if(total >= h){
      ans = "Yes";
    }else{
      ans = "No";
    }
    System.out.println(ans);
  }
}
