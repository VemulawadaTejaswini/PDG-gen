import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0;
    int max = -1;
    for(int i = 0; i < n; i++){
      int input = s.nextInt();
      sum = sum + input;
      if(input > max){
        max = input;
      }
    }
    if(sum - max > max){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}