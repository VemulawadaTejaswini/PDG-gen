public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); 
		int t = stdIn.nextInt(); 
		int a = stdIn.nextInt(); 
		int [] place = new int[n]; 
		for(int i = 0; i < n; i++) {
			place[i] = stdIn.nextInt();
		}
		double ans = Double.MAX_VALUE; 
		int j = 0;
		for(int i = 0; i < n; i++) {
			double ave = t-(place[i] * 0.006);
			double an = (ave-a)>0?ave-a:a-ave;
			if(ans>an) {
				j = i+1;
				ans = an;
			}
		}
		System.out.println(j);
	}
}
