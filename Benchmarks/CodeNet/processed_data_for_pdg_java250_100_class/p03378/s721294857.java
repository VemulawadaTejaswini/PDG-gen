public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); 
		int m = stdIn.nextInt(); 
		int x = stdIn.nextInt(); 
		int[] a = new int[m];
		for(int i = 0; i < m; i++) {
			a[i] = stdIn.nextInt();
		}
		int cntleft = 0;
		int cntright = 0;
		for(int i = 0; i < m; i++) {
			if(a[i] < x) {
				cntleft++;
			}else {
				cntright++;
			}
		}
		int min = Math.min(cntleft, cntright);
		System.out.println(min);
	}	
}
