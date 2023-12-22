import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner S = new Scanner(System.in);
    int A = S.nextInt();
    int B = S.nextInt();
    int C = S.nextInt();
    int D = S.nextInt();
    int ans = 0;
    for(int i=A;i<B;i++){
      if((i%C!=0)&(i%D!=0)){
        ans += 1;
      }
    }
    System.out.println(ans);
  }
}