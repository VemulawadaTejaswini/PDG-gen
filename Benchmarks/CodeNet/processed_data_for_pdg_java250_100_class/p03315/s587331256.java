public class Main {
	public static void main(String[] args) {
		String S = "";
		int Count = 0;
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		for(int i=0;i< S.length();i++) {
			String str=S.substring(i, i+1);
			if(str.equals("+")) {
				Count++;
			}else if(str.equals("-")){
				Count--;
			}else {
			}
		}
		System.out.println(Count);
	}
}
