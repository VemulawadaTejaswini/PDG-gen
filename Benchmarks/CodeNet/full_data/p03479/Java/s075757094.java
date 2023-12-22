import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = Long.parseLong(sc.next());
    long y = Long.parseLong(sc.next());
    long now = x;
    long len = 0L;
    while(now<=y){
      len++;
      now*=2;
    }
    
    System.out.println(len);
	System.out.flush();

  }
}