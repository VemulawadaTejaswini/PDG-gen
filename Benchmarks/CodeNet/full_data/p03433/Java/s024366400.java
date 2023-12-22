import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N;
    int A;
    N=sc.nextInt();
    A=sc.nextInt();
    while(N>=500){
      N=N-500;
    }
    if(A>=N){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}