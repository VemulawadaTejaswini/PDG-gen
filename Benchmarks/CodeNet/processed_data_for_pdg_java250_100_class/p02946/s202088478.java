public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0; i<k + k - 1; i++){
			System.out.print(x - k + 1 + i + " ");
		}
	}
}
