public class Main {
	public static void main(String[] args) {
		int i = 1;
		Scanner s = new Scanner(System.in);
		while(true){
			 int n = s.nextInt();
			 if(n==0){
				 break;
			 }
				System.out.println("Case "+ i +": "+n );
			 i++;
		}
	}
}
