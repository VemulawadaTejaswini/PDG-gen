import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();
    while(!is_prime(x)) {
    	x++;
    }
    System.out.println(x);
  }
  private static boolean is_prime(int x) {
	  boolean p = false;
	  int count = 0;
	  if(x == 2){
		  return true;
	  }else if(x%2 == 0) {
		  return false;
	  }
	  for(int i=1;i<=x;i+=2) {
		  if(x%i==0) {
			  count++;
		  }
	  }
	  if(count == 2) {
		  p = true;
	  }
	  return p;
  }
}