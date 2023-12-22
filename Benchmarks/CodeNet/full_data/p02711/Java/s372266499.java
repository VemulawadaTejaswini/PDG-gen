import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long N = scan.nextInt();
    long total = 0;
    
    for(int i = 0; N != i; N--){
      if(N%3 != 0&&N%5 != 0){
        total += N;
      }
    }
    System.out.print(total);
    }
  }




