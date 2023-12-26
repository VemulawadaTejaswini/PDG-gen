public class Main {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int k=stdin.nextInt();
		int x=stdin.nextInt();
		int kotae[]=new int[1000000];
		int t=0;
		int j=x-k+1;
		for(;;) {
			kotae[t]=j;
			if(t>=(k*2-1)) break;
			j++;
			t++;
		}
		for(int i=0;i<t;i++) System.out.printf("%d ",kotae[i]);
	}
}
