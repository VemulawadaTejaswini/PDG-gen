import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    boolean flag = ( a==b && a!=c) || (a==c && b!=c) || (b==c && b!=a);
    if(flag){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
    System.out.flush();
  }
}