import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int ans=c+b-a;
    if(ans<0){
      System.out.println(0);
    }else{
      System.out.println(c+b-a);
    }
  }
}