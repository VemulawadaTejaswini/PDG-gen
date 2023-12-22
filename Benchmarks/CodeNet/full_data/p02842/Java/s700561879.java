import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double x = n / 1.08;
    x = (int)x;
    double y = x * 1.08;
    y = (int)y;
    double z = (x+1) * 1.08;
    z = (int)z;
    
    if(n == y){
      System.out.println((int)x);
    }else if(n == z){
      System.out.println((int)x+1);
    }else{
      System.out.println(":(");
    }
    
  }
}
