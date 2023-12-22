import java.util.Scanner;

  class Main{
    public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);
      int a = stdIn.nextInt();
      int b = stdIn.nextInt();
      int X = a+b;
      int Y = a-b;
      int Z = a*b;
      int[] S = {X,Y,Z};
      int M = S[0];
      for(int i=0; i<=2; i++){
        if(M <= S[i]){
          M = S[i];
        }
      }
      System.out.println(M);
    }
  }