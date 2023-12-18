public class Main{
	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String input = in.readLine();
		 String numbers[] = input.split(" ");
		 int a = Integer.parseInt(numbers[0]);
		 int b = Integer.parseInt(numbers[1]);
		 if(a < b){
			 System.out.println("a < b");
		 }
		 else if(a > b){
			 System.out.println("a > b");
		 }
		 else{
			 System.out.println("a == b");
		 }
	}
}
