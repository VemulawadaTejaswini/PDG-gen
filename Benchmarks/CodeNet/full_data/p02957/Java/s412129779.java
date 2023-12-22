import java.util.Scanner;
public class Main{
	static int getK(int a,int b) {  
		int i,k=0;
		  i=a+b;
		    k=i/2;
		  return k ;
  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i,k=1;
	Scanner scan=new Scanner(System.in);
	 a=scan.nextInt();
	 b=scan.nextInt();
    i=a+b;
    if(i%2==0) {
    System.out.println(getK(a,b));
   }
   else { 
   System.out.println("IMPOSSIBLE");
   }
	   }
	
	 }