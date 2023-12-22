import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int max=scan.nextInt();
    int Ans=0;
    boolean flag=true;
    while(flag){
      if(num*Ans-(Ans-1)>=max){
        flag=false;
      }
      Ans++;
    }
    System.out.println(Ans);
  }
}