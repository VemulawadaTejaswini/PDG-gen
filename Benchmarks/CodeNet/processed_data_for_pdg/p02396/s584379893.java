public class Main {
	public static Scanner sc;
	public static void main(String args[]) {
		int i=1;
		int x=0;
		sc = new Scanner(System.in);
		for(;;){
			x=sc.nextInt();
			if(x==0) {
				break;
			}
			System.out.printf("Case %d: %d\n",i,x);
			i++;
		}
	}
}
