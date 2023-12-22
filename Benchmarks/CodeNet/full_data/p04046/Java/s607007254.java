import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int modnum = 1000000007;
    
    int total = modFactorial(h-w-2, h-1)*modFactorial(h-w-2, w-1)/modFactorial(h-w-2, 1)%modnum;
    for(int i=h-a; i<h; i++){
      int f = modFactorial(i+b-1, h-a)*modFactorial(i+b-1,b-1)/modFactorial(i+b-a, 1)%modnum
        *modFactorial(h-i-1+w-b, h-i-1)*modFactorial(h-i-1+w-b, w-b)/modFactorial(h-i-1+w-b, 1)%modnum;
      total -= f;
    }
    
    System.out.println(total);
  }
  
  private static int modFactorial(int n, int stop){
    int r = 1;
    for(int i=stop; i<=n; i++){
      r *= i%1000000007;
    }
    return r;
  }
}