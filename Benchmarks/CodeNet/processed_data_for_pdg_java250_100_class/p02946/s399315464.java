public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		PrintWriter out = new PrintWriter(System.out);
		for(int i = 0; i < 2 * k - 1; i++){
			int t = x - k + 1 + i;
			out.print(t);
			if(i == 2 * k - 2) out.println();
			else out.print(" ");
		}
		out.flush();
	}
}
