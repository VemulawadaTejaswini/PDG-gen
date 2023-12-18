public class Main{
	public static void main(String[] args){
		int i = 1;
		Scanner sc = new Scanner(System.in);
		while(true){
			int inputData = sc.nextInt();
			if(inputData == 0){
				break;
			}
			System.out.println("Case " + i + ": " + inputData);
			i++;
		}
	}
}
