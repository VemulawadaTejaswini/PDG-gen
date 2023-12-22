import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 int water,sugar;
	 Scanner sc=new Scanner(System.in);
	 int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),D=sc.nextInt(),E=sc.nextInt(),F=sc.nextInt();
	 double noudo=0.0;
	 int maxm=0;
	 double limit;
	 int maxsugar=0;
	 double maxnoudo=0.0;
	 for(int a=0;a*A*100<=F;a++) {
		 for(int b=0;b*100<=F-a*A*100;b++) {
			 water=100*A*a+100*B*b;
			 if(water==0) {
				 continue;
			 }
			 for(int c=0;c*C<=F-water;c++) {
				 for(int d=0;d*D<=F-water-c*C;d++) {
				     sugar=c*C+d*D;
				     
					 if(sugar>water/100*E) {
						 continue;
					 }
					 
						 noudo=(double)sugar/((double)sugar+(double)water);
						
				  if(noudo>maxnoudo) {
					 maxnoudo=noudo;
					 maxm=sugar+water;
					 maxsugar=sugar;
					 
				  }
					 
				 }
				 
				 
			 }
			 
		 }
	 }
	 System.out.println(maxm+" "+maxsugar);
	 
 }
}
