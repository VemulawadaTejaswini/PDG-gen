import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int A=scanner.nextInt();
    int B=scanner.nextInt();
    int K=scanner.nextInt();
    
    
    if(A>=K){
      A=A-K;
      System.out.println(A);
      System.out.println(B);
    }else if(A<K&&A+B>K){
      int j=A+B-K;
      System.out.println("0");
      System.out.println(j);
    }else{
      System.out.println("0");
      System.out.println("0");
    }
                         }
                         }
                         
                   