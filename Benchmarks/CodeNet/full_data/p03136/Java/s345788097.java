import java.util.Scanner;

 class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);

	        int sumOfLeft=0;
        	int max=0;
	        int side=0;
		int N=s.nextInt();
System.out.println(N);
        	 for(int i=0;i<N;i++){
	         	side=s.nextInt();
			System.out.println(side);
			sumOfLeft+=side;
			System.out.println(sumOfLeft);
        		if(max<side) max=side;
			System.out.println(max);
			System.out.println();
        	 }
	         if(sumOfLeft>=2*max) System.out.println("No"+sumOfLeft+max);
        	 else System.out.println(("Yes"+sumOfLeft)+max);
     }
 }