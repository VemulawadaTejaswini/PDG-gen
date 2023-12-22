import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    for(int j = 1; j <= n; j += 2){
      int odd = 3;
      int j_ = j;
      int count = 2;
      while(odd < j){
        if(j_ % odd == 0){
          j_ /= odd;
          count++;
        }
        else{
          odd += 2;
        }
      }
      if(count == 8){
        result++;
      }
    }
    System.out.println(result);
  }
}
