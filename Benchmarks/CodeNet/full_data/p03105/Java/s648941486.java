import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(); //価格
    int B = sc.nextInt(); //所持金
    int C = sc.nextInt(); //聞きたい回数
    
    if(B>A*C){
      System.out.println(C);
    }else{
      System.out.println(B/A);
    }
  }
}