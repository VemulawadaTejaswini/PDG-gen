public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int x=Integer.parseInt(sc.next());
		while(x!=0){
			System.out.println("Case "+i+": "+x);
			i++;
			x=Integer.parseInt(sc.next());
		}
	}
}
