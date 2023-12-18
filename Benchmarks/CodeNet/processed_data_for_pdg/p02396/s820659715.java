public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 Integer case_num = 1;
		 while(true){
			 String input = in.readLine();
			 if(input.equals("0")){
				 break;
			 }
			 System.out.println("Case " + case_num + ": " + input);
			 case_num += 1;
		 }
	}
}
