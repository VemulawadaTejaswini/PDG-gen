import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double a;

    if(1<=n && n<=100){

      if(n%2==0){
        a = n/2/n;
      }else{
        a = (n+1)/2/n;
      }

      System.out.println(a);
    }
  }

}
