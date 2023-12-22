import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int a,b;
    a=scan.nextInt();
    for(int i=1;i<n;i++){
      b=scan.nextInt();
      a=gcd(a,b);
    }
  }
  System.out.println(a);
  public static int gcd(int a,int b){
    if(b==0){
      return a;
    }else{
      return gcd(b,a%b);
    }
  }
}
