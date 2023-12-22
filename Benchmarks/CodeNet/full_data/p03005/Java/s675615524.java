import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    
    if(k == 1){
      System.out.println(0);
    }else{
      System.out.println(n - k);
    }
  }
}