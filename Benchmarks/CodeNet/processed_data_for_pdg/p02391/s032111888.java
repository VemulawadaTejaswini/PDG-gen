public class Main{
	public static void main (String[] args){
		Scanner standard = new Scanner(System.in);
		int a = 0; 
		int b = 0; 
		a = standard.nextInt();
		b = standard.nextInt();
			if(a < b){
				System.out.println("a < b"); 
			}else if (a > b){
				System.out.println("a > b");
			}else if (a == b){
				System.out.println("a == b");
			}
	}
}
