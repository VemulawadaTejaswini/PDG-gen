public class Main{
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++){
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = arr.length - 1; j > i; j--){
				if(arr[j] < arr[j - 1]){
					int big = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = big;
				}
			}
		}
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
	}
}
