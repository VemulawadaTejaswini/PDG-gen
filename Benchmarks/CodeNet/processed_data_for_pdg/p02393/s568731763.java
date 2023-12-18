public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[3];
		numbers[0] = sc.nextInt();
		numbers[1] = sc.nextInt();
		numbers[2] = sc.nextInt();
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2 - i;j++){
				if(numbers[j] > numbers[j+1]){
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
	}
}
