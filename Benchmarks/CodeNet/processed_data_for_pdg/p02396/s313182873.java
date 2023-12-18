public class Main {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int i,s;
		i = 0;
		while(true){
			i++;
			s = scan.nextInt();
			if(s == 0){break;}
			sb.append("Case ");
			sb.append(Integer.toString(i));
			sb.append(": ");
			sb.append(Integer.toString(s));
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}
}
