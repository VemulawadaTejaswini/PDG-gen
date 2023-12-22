import java.util.Scanner;
class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int big = Math.max(a,b);
    int small = Math.min(a,b);
    String ans = "";
    for(int i=0;i<big;i++){
      ans += small;
    }
    System.out.println(ans);
  }
}