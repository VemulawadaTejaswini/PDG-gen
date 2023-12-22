public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		// 
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int a = Integer.parseInt(line[1]);
		int b = Integer.parseInt(line[2]);
		br.close();
		int sum = 0;
		if(n<=a+b || a == 0) {
			System.out.println(a);
		}else {
			int mod = n%(a+b);
			int div = n/(a+b);
			int blue = 0;
			if(mod==0 || mod<=a) {
				blue = a * div + mod;
			}else {
				blue = a * div + (mod-a);
			}
			System.out.println(blue);
		}
	}
}
