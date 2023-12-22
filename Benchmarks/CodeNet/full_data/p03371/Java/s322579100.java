import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
	  long min=Long.MAX_VALUE;
	  for(int i=0;i<=Math.max(x, y);i++) {
		  min=Math.min(min, 2*c*i+Math.max(0, x-i)*a+Math.max(0, y-i)*b);
	  }

	  System.out.println(min);
  }
}
