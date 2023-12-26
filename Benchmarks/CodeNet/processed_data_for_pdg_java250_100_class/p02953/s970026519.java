public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		for(int i=0;i<N;i++) {
			H[i]=sc.nextInt();
		}		
		sc.close();
		boolean out = false;
		H[0]--;
		for(int i=0;i<N-1;i++) {
			if(H[i+1]<H[i]) {
				out = true;
			}
			if(H[i+1]-1>=H[i]) {
				H[i+1]--;
			}
		}
		if(out)System.out.println("No");
		else System.out.println("Yes");
	}
}
