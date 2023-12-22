import java.util.Scanner;
Main class{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int num = n - n/2;
    double ans = num/n;
    System.out.println(ans);
  }
}
      