import java.util.Scanner;

calss Main{
  public static void main(String[] args){
    Scanner sc = new Scanner();
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int modnum = 1000000007;
    
    int r = modFactorial(h-a+b, h-a)%modnum*modfactorial(h-a+b, b)%modnum/modFactorial(h-a+b, 1);
    r = r*modFactorial(w+a-b, a)%modnum*modFactorial(w+a-b, w-b)%modnum/modFactorial(w+a-b);
    
    System.out.println(r);
  }
  
  private static int modFactorial(int n, int stop){
    if(n == 1){
      return 1;
    }else if(n == stop+1){
      return n%1000000007;
    }else{
      return modFactorial(n-1)*(n%1000000007);
    }
  }