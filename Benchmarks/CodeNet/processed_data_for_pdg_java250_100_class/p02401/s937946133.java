public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String s = sc.next();
			int b = sc.nextInt();
			if(s.equals("?")) break;
			else if(s.equals("+")) System.out.println(a+b);
			else if(s.equals("-")) System.out.println(a-b);
			else if(s.equals("*")) System.out.println(a*b);
			else if(s.equals("/")) System.out.println(a/b);
		}
	}
}
