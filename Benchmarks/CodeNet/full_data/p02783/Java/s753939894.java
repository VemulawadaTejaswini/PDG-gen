import java.util.*;  
public class Main{    
      public static void main(String args[]){ 
      Scanner sc = new Scanner (System.in);
	int h = sc.nextInt();
	int b = sc.nextInt();
	int r=0;
	while(h>0)
	{
	    h=h-b;
	    r++;
	}
	System.out.println("" +r);
      }
  }
  