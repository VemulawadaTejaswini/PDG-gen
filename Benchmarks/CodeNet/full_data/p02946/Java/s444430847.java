import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int left_end = Math.max(-1000000,x - n + 1);
    int right_end = Math.max(1000000,x + n - 1);
    for(int i = left_end; i < right_end; i++){
      System.out.println(i + " ");
    }
  }
}