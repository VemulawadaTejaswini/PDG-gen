class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String 
				input,
				output = "";
		input = sc.nextLine();
		char[] c = new char[input.length()];
		c = input.toCharArray();
		for(int i = 0;i < c.length;i++){
			if(c[i] == Character.toUpperCase(c[i])){
				output += Character.toLowerCase(c[i]);
			}else{
				output += Character.toUpperCase(c[i]);
			}
		}
		System.out.println(output);
	}
}
