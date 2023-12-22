import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int sum = 0;
    boolean flag = true;
    while(t-->0){
      int n = in.nextInt();
      sum += in.nextInt();
      sum += in.nextInt();
      
      if (sum > n){
        if((sum-n)%2 != 0){
          flag = false;
          break;
        }
      }
      else if(sum < n){
        if((n-sum)%2 != 0){
          flag = false;
          break;
        }
      }
    }
    if(flag) System.out.println("Yes");
    else System.out.println("No");
  }
}