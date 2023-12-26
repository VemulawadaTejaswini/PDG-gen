public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			String op = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			int ans =0;
			if(op.equals("+")){
				ans = a + b;
				System.out.println(ans);
			}else if(op.equals("-")){
				ans = a - b;
				System.out.println(ans);
			}else if(op.equals("*")){
				ans = a * b;
				System.out.println(ans);
			}else if(op.equals("/")){
				ans = a / b;
				System.out.println(ans);
			}else if(op.equals("?")){
				break;
			}
		}
	}
}
