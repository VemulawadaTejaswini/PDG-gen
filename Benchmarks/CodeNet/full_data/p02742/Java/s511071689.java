import java.util.*;
public class Main {
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	  int h=input.nextInt();int w=input.nextInt();
	  long sum=0;
	  if(w%2==0)sum=(long)h*w/2;
	  else
	  {
		  int k=h/2;
		  sum+=(long)k*((w+1)/2+(w-1)/2);
		  if(h%2==1)sum+=(w+1)/2;
	  }
	  System.out.println(sum);
 }
}
