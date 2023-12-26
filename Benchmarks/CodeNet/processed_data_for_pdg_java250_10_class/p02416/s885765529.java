class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int
				sum;
		String
				input,
				output = "";
		input = sc.next();
		while(!(input.equals("0"))){
			sum = 0;
			for(int i = 0;i < input.length();i++){
				sum += Character.getNumericValue(input.charAt(i));
			}
			output += sum + "\n";
			input = sc.next();
		}
		System.out.println(output.substring(0, output.length()-1));
	}
}
