public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int shiftBy = sc.nextInt();
		char[] input = sc.next().toCharArray();
		StringBuilder output = new StringBuilder();
		for (char c : input)
		{
			int findInt = c + shiftBy;
			if ( findInt > 90 )  findInt -= 26;
			char tchar = (char) (findInt);
			output.append(tchar);
		}
		sc.close();
		System.out.println(output.toString());
	}
}
