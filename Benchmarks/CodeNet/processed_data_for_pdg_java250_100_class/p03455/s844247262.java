public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A%2==1 && B%2==1){
				System.out.println("Odd");
		}else{
			System.out.println("Even");
		}
	}
}
