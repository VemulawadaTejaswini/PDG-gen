public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		int from = x - k + 1;
		int to = x + k - 1;
		for(int i = from; i <= to; i++){
		    System.out.print(i + " ");
		}
	}
}
