public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = scan.nextInt();
		}
		for(int j = n-1; 0 <= j; j-- ){
			System.out.print(ary[j]);
			if(j != 0){
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
	}
}
