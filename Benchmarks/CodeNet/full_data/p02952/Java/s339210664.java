
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int digit=1,count=0;
		 for(int i=1;i<=n;i++) {
			 if(i%10==0){
				 int tmp=0,x=i;
				 while(x!=0) {
					 x=x/10;
					 tmp++;
				 }
				 digit=tmp;
			 }
			 if(digit%2!=0) {
				// System.out.println(i);
					 count++;				 
			 }
		 }
		 System.out.println(count);
	}

}
