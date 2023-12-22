import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int x = Integer.parseInt(S[0]);
    int y = Integer.parseInt(S[1]);
    int ans = 0;
    if(x >= 0 && y >= 0 && x < y){
      ans = y - x;
    }else if(x >= 0 && y >= 0 && x > y){
      ans = x - y + 2;
    }else if((x >= 0 && y < 0) || (y >= 0 && x < 0)){
      ans = Math.abs(Math.max(x, y) + Math.min(x, y)) + 1;
    }else{
      ans = Math.abs(Math.min(x, y)) - Math.abs(Math.max(x, y)) + 2;
    }
    System.out.println(ans);
  }
}