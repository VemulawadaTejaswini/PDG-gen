import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long n = sc.nextLong();
	  int m = sc.nextInt();
	  for(int i = 0; i < m; i++) {
		  n -= sc.nextLong();
		  if(n < 0) {
			  n = -1;
			  break;
		  }
	  }
	  System.out.println(n);
	}
}