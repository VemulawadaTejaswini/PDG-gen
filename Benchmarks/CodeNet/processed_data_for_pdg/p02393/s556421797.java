public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		if(inputArray.length == 3){
			for(int i = 0; i< inputArray.length - 1; i++){
				for(int j = inputArray.length -1; j > i; j--){
					if(Integer.parseInt(inputArray[j]) < Integer.parseInt(inputArray[j - 1])){
						String str = inputArray[j];
						inputArray[j] = inputArray[j - 1];
						inputArray[j - 1] = str;
					}
				}
			}
			System.out.println(inputArray[0] + " " + inputArray[1] + " " + inputArray[2]);
		}
	}
}
