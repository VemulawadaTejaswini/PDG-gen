public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		while(a<=n){
			int b = a;
			if(b%3==0){
				System.out.print(" "+a);
			}else{
				while(b>0){
					if(b%10==3){
						System.out.print(" "+a);
						break;
					}
					b/=10;
				}
			}
			a++;
		}
		System.out.println("");
	}
}
