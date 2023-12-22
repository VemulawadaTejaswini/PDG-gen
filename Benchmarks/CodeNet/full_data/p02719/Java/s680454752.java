import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか
    long y = sc.nextLong();
    long z = x / y;
    x = x - y*z;
    if (Math.abs(x-y) < x){
      x = Math.abs(x-y);
    }
    
    System.out.println(x);
    
  }
}
