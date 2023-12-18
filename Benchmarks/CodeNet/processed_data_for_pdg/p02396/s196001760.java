public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=0;
		int x;
		do{
			i++;
			x= scan.nextInt();
			if(x==0) break;
			System.out.println("Case "+i+": "+x);
		}while(true);
	}
}
