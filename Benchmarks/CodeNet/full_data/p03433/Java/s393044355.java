import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N;
    int A;
    System.out.println("何円を調べるか");
    N=sc.nextInt();
    System.out.println("一円玉の枚数(A<1000)");
    A=sc.nextInt();
    while(N>500){
      N=N-500;
      //System.out.println("N="+N);
    }
    if(A>=N){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}
