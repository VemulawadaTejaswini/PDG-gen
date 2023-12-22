public class Demo5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] c = str.toCharArray();
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='1'){
				index++;
			}
		}
		System.out.println(index);
	}
}