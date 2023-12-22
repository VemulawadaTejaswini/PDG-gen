import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int max=scan.nextInt();
    int Ans=0;
    boolean flag=true;
    if(){
    }
    while(flag){
      Ans++;
      if(num*Ans-(Ans-1)>=max){
        flag=false;
      }
    }
    System.out.println(Ans);
  }
}