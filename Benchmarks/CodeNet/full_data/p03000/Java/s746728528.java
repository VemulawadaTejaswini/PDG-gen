import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int ball = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int howmany = 0;
    for(int i = 0; i < n+1; i++){
      if(ball<=x){
        howmany++;
        if(i==n){
          System.out.println(howmany);
        }else{
          ball = ball + sc.nextInt();
        }
      }else{
        System.out.println(howmany);
        break;
      }
    }
  }
}
      