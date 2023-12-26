public class Main{
	public static void main(String[] args) throws IOException{
		int n,ai,min,max,i;
		long sum = 0;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		String[] strAry = br.readLine().split(" ");
		for (i = 0; i < n; i++){
			ai = Integer.parseInt(strAry[i]);
			if(ai < min) min = ai;
			if(ai > max) max = ai;
			sum += ai;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}
