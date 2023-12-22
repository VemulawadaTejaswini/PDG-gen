import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int K =sc.nextInt();
      	 int sum = 0;
      
      for(int a=1; a<=K; a++){
    	  for(int b=1; b<=K; b++){
    		  for(int c=1; c<=K; c++){
    			  sum += gcd(gcd(a,b),c);
    		  }
    	  }
      }
      System.out.println(sum);
    }
      public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
}