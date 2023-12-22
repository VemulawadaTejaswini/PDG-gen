import java.util.Scanner;

class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String S=sc.nextLine();
    String T=sc.nextLine();
    String U=sc.nextLine();
    
    int A=sc.nextInt();
    int B=sc.nextInt();
   
    
    if(S==U){
      int calc=A-1;
      System.out.println(calc);
      System.out.println(B);
    }else{
        int calc=B-1;
         System.out.println(A);
         System.out.println(B);
      }
   }
}