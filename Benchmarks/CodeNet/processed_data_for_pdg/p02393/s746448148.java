public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int[] arr = new int[]{num1,num2,num3};
		Arrays.sort(arr);
		for(int i = 0; i<arr.length;i++){
			if(i < 2){
				System.out.print(arr[i]+ " ");
			}else{
				System.out.print(arr[i]);
			}
		}
		System.out.println();
	}
}
