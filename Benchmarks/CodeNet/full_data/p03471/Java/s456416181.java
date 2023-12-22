import java.util.Scanner;
public class Main {
      
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int n = sc.nextInt();  int y = sc.nextInt();
	 sc.close();
	        for(int j =0; j<=y/5000;j++) {
	        	for(int i =0; i<=y/10000; i++)  {
   		       
   			 int a = i;   int b = j;    int c= n-i-j;       
    	if(10000*a+5000*b+1000*c==y&&a>=0&&b>=0&&c>=0) {
    			System.out.println(a+" "+b+" "+c);
    			System.exit(0);}
    		}
      }
     System.out.println("-1 -1 -1");
        
	 }
}
