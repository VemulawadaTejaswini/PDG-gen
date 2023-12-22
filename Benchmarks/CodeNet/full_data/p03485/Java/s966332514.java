import java.util.Scanner;

public static Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b, c, d;
    a = sc.nextInt();
    b = sc.nextInt();
    c = (a+b)/2;
    d = (a+b)%2;
    
    if(d == 0){
      System.out.println(c);
    }else{
      System.out.println(c + 0.5);
    }
    
  }
}