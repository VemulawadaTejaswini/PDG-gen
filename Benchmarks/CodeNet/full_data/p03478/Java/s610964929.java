 public class Main {
	 
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int A=in.nextInt();
		int B=in.nextInt();
		int s=0;
		 for (int i=1; i <= N; i++) {
	            if( ((int)i/10000 + ( (int)i/1000 % 10) + ( (int)i/100 % 10) + ( (int)i/10 % 10) + i%10) >= A && ((int)i/10000 + ( (int)i/1000 % 10) + ( (int)i/100 % 10) + ( (int)i/10 % 10) + i%10) <= B)
		     s=s+i;
		 }
	            	System.out.println(s);
		
	}
}
