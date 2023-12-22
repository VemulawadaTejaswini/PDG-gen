import java.util.*;

public class Main{
  public static void main(String args[]){
    //入力
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    
    //初期値
    String[] arrayS = S.split("");
    int N = S.length();
	int[] nums = new int[N];
    for(int num: nums){
      num = 0;
    }
    
    //処理内容
    int loop = 0;
    
    for(int i = 0; i < N; i++){
      if("R".equals(arrayS[i])){
        for(int j = 1; j < N - i; j++){
          if("L".equals(arrayS[i + j])){
            loop = i + j;
            if(j % 2 == 0){
              nums[loop]++;
              break;
            } else {
              nums[loop - 1]++;
              break;
            }
          }
        }
      }
      
      if("L".equals(arrayS[i])){
        for(int j = 1; j < N - i; j++){
          if("R".equals(arrayS[i - j])){
            loop = i - j;
            if(j % 2 == 0){
              nums[loop]++;
              break;
            } else {
              nums[loop + 1]++;
              break;
            }
          }
        }
      }
    }
    
    for(int num: nums){
      System.out.print(num);
      System.out.print(" ");
    }
  }
}
