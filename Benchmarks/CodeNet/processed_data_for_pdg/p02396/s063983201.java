public class Main{
	public static void main(String[] args) throws IOException{
		int[] data = new int[10001];
		Scanner input = new Scanner(System.in);
		for(int i=0; i < 10001; i++){
			data[i] = Integer.parseInt(input.nextLine());
			if( data[i] == 0){
				break;
			}
		}
		for(int i=0; i < 10001; i++){
			if( data[i] == 0){
				break;
			}
			System.out.println("Case "+ (i+1) + ": " + data[i]);
		}
	}
}
