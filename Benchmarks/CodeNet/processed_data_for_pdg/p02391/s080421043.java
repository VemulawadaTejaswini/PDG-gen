public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String inputValue = br.readLine();
		String[] valueArray = inputValue.split(" ");
		int a = Integer.parseInt(valueArray[0]);
		int b = Integer.parseInt(valueArray[1]);
		if(a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else if(a == b){
			System.out.println("a == b");
		}
	}
}
