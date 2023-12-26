public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long wk_cost = 0;
    	long wk_time = 0;
    	long min_cost = Long.MAX_VALUE;
    	String ans="TLE";
		long N = sc.nextLong();
		long T = sc.nextLong();
		for(int i=1;i<=N;i++){
			wk_cost=sc.nextLong();
			wk_time=sc.nextLong();
			if (wk_time<=T) {
				min_cost=Math.min(min_cost,wk_cost);
			}
		}
		if (min_cost==Long.MAX_VALUE){
			System.out.println(ans);		
		}
		else{
			System.out.println(min_cost);
		}  
    }
}	
