public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int[] intArray = {a, b, c};
	for(int i = 0; i < intArray.length-1; i++){
        for(int j = i+1; j < intArray.length; j++){
            if(intArray[j] < intArray[i]){
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
    }
		System.out.print(intArray[0] + " " + intArray[1] + " " + intArray[2]);
	System.out.println();
	}
}
