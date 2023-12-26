public class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			while(true){
				String ans = br.readLine();
				StringTokenizer stk = new StringTokenizer(ans," ");
				int a = Integer.parseInt(stk.nextToken());
				String op = stk.nextToken();
				int b = Integer.parseInt(stk.nextToken());
				if(op.equals("?")) break;
				if(0 <= a && a<=20000
					&& 0 <= b && b<=20000){
					if(op.equals("+")){
						System.out.printf("%d\n",a+b);
					}else if(op.equals("-")){
						System.out.printf("%d\n",a-b);
					}else if(op.equals("*")){
						System.out.printf("%d\n",a*b);
					}else if(op.equals("/")){
						System.out.printf("%d\n",a/b);
					}
				}
			}
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}
