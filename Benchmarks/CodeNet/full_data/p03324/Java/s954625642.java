import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int D;
    int N;

    Scanner sc = new Scanner(System.in);

    D = sc.nextInt();
    N = sc.nextInt();

    if(N<=99){
      System.out.println(N*Math.pow(100,D));
    }else{
      System.out.println(101*Math.pow(100,D));
    }
  }
}
