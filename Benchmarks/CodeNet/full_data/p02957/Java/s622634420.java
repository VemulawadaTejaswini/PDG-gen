import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();


    if(A % 2 == B % 2){
      for(int K = 1;K<1000000000;K++){
        int a = Math.abs(A-K);
        int b = Math.abs(B-K);
        if(a == b){
          System.out.println(K);
          break;
        }
      }
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }

}
