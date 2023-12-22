public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0){
				break;
			}
			String[] tmpArray = br.readLine().split(" ");
			int[] input = new int[n];
			int sum = 0;
			for(int i = 0; i < n ; i++){
				input[i] = Integer.parseInt(tmpArray[i]);
				sum += input[i];
			}
			double ave = (double)sum / n;
			double var = 0;
			for(int i = 0; i < n ; i++){
				var += Math.pow((input[i] - ave) , 2)/n;
			}
			System.out.println(Math.pow(var, 0.5));
		}
	}
}
