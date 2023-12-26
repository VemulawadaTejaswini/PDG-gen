public class Main {
	public static void main(String[] args) {
		char[] input=new Scanner(System.in).nextLine().toCharArray();
		int x=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]=='1') {
				x++;
			}
		}
		System.out.println(x);
	}
}
