public class Main {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder b = new StringBuilder();
		int i,s;
		i = 0;
		while(true){
			i++;
			s = scan.nextInt();
			if(s == 0){break;}
			b.append("Case ");
			b.append(Integer.toString(i));
			b.append(": ");
			b.append(Integer.toString(s));
			b.append("\n");
		}
		System.out.print(new String(b));
	}
}
