import java.util.*;



class Main {
	public static void main (String args[]){
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 
		 if(N==1){
			 System.out.println("Hello World!");
		 }
		 
		 if(N==2){
           Scanner scan2 = new Scanner(System.in);
			 int A = scan2.nextInt();
			 int B = scan2.nextInt();
			 
			 System.out.println(A+B);
		 }
	 }
}
