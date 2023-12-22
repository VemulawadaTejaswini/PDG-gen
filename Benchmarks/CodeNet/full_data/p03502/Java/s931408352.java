import java.util.*;
public class Main{
  public static void main(String[] args){
    try{
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      if(N%(findSumOfDigits(N))==0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      scanner.close();
    }catch(Exception e){
      System.out.println("何か入力してください");
    }
  }
  public static int findSumOfDigits(int n){
    int sum = 0;
    while(n>0){
      sum += n%10;
      n /= 10;
    }
    return sum;
  }
}
