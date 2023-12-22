import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan;
    int N;
    
    scan = new Scanner(System.in);
    N = scan.nextInt();
    
    if (N.contains("7")){
    System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
