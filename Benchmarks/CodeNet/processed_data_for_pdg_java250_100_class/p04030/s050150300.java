 class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder output = new StringBuilder();
		for (int i=0; i<input.length(); ++i) {
		    if (input.charAt(i) != 'B') {
		        output.append(input.charAt(i));
		    }else {
		        int len = output.length();
		        if (len > 0) {
		            output.deleteCharAt(len-1);
		        }
		    }
		}
		sc.close();
		System.out.println(output);
	}
}
