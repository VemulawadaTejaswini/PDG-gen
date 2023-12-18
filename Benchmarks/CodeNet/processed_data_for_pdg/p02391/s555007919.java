public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int a = Integer.parseInt(tmpArray[0]);
		int b = Integer.parseInt(tmpArray[1]);
		if(a > b){
			System.out.println("a > b");
		}
		else if(a == b){
			System.out.println("a == b");
		}
		else{
			System.out.println("a < b");
		}
	}
}
