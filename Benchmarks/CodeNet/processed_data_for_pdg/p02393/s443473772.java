public class Main{
	public static void main(String[] args){
		int[] array = new int[3];
		Scanner sc = new Scanner(System.in);
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
		for(int i = 0 ;i < array.length-1 ;i++){
			for(int j = 0;j < array.length-1 ;j++){
				if(array[j] > array[j+1]){
					int intChange = array[j];
					array[j] = array[j+1];
					array[j+1] = intChange;
				}
			}
		}
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}
}
