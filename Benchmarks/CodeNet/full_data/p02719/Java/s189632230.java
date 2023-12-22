import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    
    int ans = min(n%k , (k-n)%k);
    System.out.println(ans);
  }
}

