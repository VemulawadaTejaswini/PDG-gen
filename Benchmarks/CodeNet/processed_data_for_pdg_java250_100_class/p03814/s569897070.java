public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int start = -1;
		int end = -1;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'A' && start == -1){
				start = i;
			}
			if(s.charAt(i) == 'Z' && start != -1){
				end = i;
			}
		}
		System.out.println(end-start+1);
	}
}
