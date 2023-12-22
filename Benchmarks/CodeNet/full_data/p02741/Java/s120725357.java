import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 long a =scn.nextLong();
		 long b =scn.nextLong();
		 long c = scn.nextLong();
		  double val1 = Math.sqrt(a);
		  double val2=Math.sqrt(b);
		   double val3=Math.sqrt(c);
		 //  System.out.println(val3);
		   if((val1+val2)<val3){
			   System.out.println("Yes");
		   }else{
			   System.out.println("No");
		   }
		  

	}

}