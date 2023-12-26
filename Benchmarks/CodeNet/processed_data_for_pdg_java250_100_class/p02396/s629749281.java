public class Main {
	public static void main(String[] args) throws IOException{
		int a = 0;
		int n = 10000; 
		int j = 0;
		ArrayList<Integer> parse = new ArrayList<Integer>(); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(j != n){
			a = Integer.parseInt(br.readLine());
			if(a == 0){
				break;
			}
			parse.add(a);
			++j;
		}
		for(int i = 1; i <= parse.size(); ++i){
		System.out.println("Case " + (i) + ": " + parse.get(i-1));
		}
	}
}
