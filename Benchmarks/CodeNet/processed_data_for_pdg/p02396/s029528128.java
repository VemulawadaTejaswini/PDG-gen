public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i;
		for(i = 1;;++i){
			int x = scan.nextInt();
			if(x == 0)
				break;
			System.out.println("Case "+i+": "+x);
		}
	}
}
