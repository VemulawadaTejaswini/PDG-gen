import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int k = sc.nextInt();
    int s = sc.nextInt();
    int sum = 0;
    for(int i = 0; i <= k; i++){
      for(int j = 0;j <= s - i; j++){
        if(s - i - j <= k && s - j - k >= 0){
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
}