import java.util.Scanner;
class Main{
	   public static void main(String[] args){
	  Scanner scan =  new Scanner(System.in);
	   int a = scan.nextInt();
	   int e =0;
	   int f = 1000000000;
	   for(int i=1;i<=a/2;i++){ 
		   int b=0;
		   if(a%i==0){
			   b = a/i;
			   int d = String.valueOf( b ).length();
	           int c = String.valueOf(i).length();
	           e =  Math.max(d,c);
		   }
		   if(e<f){
			   f=e;
		   }
		   
	   }
	   System.out.println(f);
	   }
	}