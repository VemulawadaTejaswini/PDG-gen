public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[2]);
			if(tmpArray[1].equals("?")){
				break;
			}
			String op = tmpArray[1];
			if(op.equals("+")){
				System.out.println(a+b);
			}
			if(op.equals("-")){
				System.out.println(a-b);
			}
			if(op.equals("*")){
				System.out.println(a*b);
			}
			if(op.equals("/")){
				System.out.println(a/b);
			}
		}
	}
}
