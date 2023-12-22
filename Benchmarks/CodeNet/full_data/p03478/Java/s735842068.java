public class Sums{
	public static void main(String[] args){
		int n = Integer.valueOf(args[0]);
		int a = Integer.valueOf(args[1]);
		int b = Integer.valueOf(args[2]);
		
		int total = 0;

		for(int i=1;i<=n;i++){
			int sum = i/10000 + i%10000/1000 + i%1000/100 + i%100/10 + i%10;
			if (a<=sum&&sum<=b){
				total = total + i;
			}
		}
		System.out.println(total);
	}
}