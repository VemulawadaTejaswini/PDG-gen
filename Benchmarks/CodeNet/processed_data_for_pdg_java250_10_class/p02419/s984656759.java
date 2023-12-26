public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();
		W = W.toLowerCase();
		int num = 0;
		for(;;){
			String T = sc.next();
			if(T.equals("END_OF_TEXT"))break;
			T = T.toLowerCase();
			if(W.equals(T))num++;
		}
		System.out.println(num);
	}	
}
