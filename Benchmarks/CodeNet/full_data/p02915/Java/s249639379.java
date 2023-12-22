import java.util.Scanner;
     
  class Password{
    public static void Password(String[] args){
       Scanner stdIn = new Scanner(System.in);
       N = stdIn.nextInt();
       if(N >= 1 && N <= 9){
        System.out.println(N*N*N);
        }
   }
}