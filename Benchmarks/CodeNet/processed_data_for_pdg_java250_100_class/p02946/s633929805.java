public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A =b-a+1;
		int B =b+a;
		for(int c=A;c<B;c++){
		if(c<B-1){
			System.out.print(c+" ");
			}
		else {
			System.out.println(c);
		}
		}
	}
}
