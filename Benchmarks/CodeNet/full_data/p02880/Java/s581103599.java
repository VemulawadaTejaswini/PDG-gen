import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    System.out.println(check(N));
  }
  public static String check(int n){
    String ans="";
    for (int i=1; i<=9; i++){
      if ((n%i==0)&&(n/i<=9)){
        ans="Yes";
        break;
      }
      else{
        ans="No";
      }
    }
    return ans;
  }
}