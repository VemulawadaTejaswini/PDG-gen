public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt(); 
		int aa = a-1; 
		int b = stdIn.nextInt(); 
		int count = 1; 
		if(b==1){
			System.out.println(0);
			System.exit(0);
		}
		if(a>=b){
			System.out.println(count);
			System.exit(0);
		}
		do{
			a+=aa;
			count++;
		}while(a<b);
		System.out.println(count);
		stdIn.close();
	}
}
