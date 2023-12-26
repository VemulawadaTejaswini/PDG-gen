public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		ArrayList<String> array = new ArrayList<String>();
		int card = sc.nextInt();
		for(int i = 0; i <= card; i++){
			array.add(sc.nextLine());
		}
		for(int i = 1; i < 14; i++){
			if(array.contains("S " + i) ==false){
				System.out.println("S " + i);
			}
		}
		for(int i = 1; i < 14; i++){
			if(array.contains("H " + i) ==false){
				System.out.println("H " + i);
			}
		}
		for(int i = 1; i < 14; i++){
			if(array.contains("C " + i) ==false){
				System.out.println("C " + i);
			}
		}
		for(int i = 1; i < 14; i++){
			if(array.contains("D " + i) ==false){
				System.out.println("D " + i);
			}
		}
	}
}
