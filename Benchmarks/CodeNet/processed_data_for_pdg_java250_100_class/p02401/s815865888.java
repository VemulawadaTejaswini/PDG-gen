public class Main {
	public static void main(String[] args) throws Exception{
		int a, b;
		int ans = 0;
		String op = "";
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
	        a = scan.nextInt();
	        op = scan.next();
	        b = scan.nextInt();
	        switch(op){
		        case "+":
		        	ans = a + b;
		        	break;
		        case "-":
		        	ans = a - b;
		        	break;
		        case "*":
		        	ans = a * b;
		        	break;
		        case "/":
		        	ans = a / b;
		        	break;
	        }
	        if (!op.equals("?")) System.out.println(ans);
	        else break;
		}
	}
}
