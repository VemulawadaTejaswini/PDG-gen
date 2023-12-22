import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int w =scn.nextInt();
		int h = scn.nextInt();
	    long val = (long)(w)*h;
	      if(val%2==0){
	    	  System.out.println(val/2);
	      }else{
	    	  System.out.println((val/2+1));
	      }
	    

	}

}