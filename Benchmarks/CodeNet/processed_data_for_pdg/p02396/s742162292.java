public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x;
		int i = 0;
		while(true){
			x = scan.nextInt();
			if(x == 0){
				break;
			}else{
				System.out.println("Case " + (i + 1) + ": " + x);
				i++;
			}
		}
	}
}
