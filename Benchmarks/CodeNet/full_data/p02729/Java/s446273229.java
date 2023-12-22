java.util.Scanner;
class Main{
  
  int sum(int n){
    return n*(n+1)/2;
  }

  public static void main(String[] args){
    int n,m;
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    m = scan.nextInt();
    System.out.print(sum(n-1)+sum(m-1));
  }
}