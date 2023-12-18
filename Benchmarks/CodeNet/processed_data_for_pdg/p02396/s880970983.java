public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0,x;
		while(true) {
			x=scan.nextInt();
			if(x==0)break;
			i++;
			System.out.println("Case "+i+": "+x);
		}
		scan.close();
	}
}
