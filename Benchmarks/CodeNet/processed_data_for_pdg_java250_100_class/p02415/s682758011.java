public class Main {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		char[] c = text.toCharArray();
		for(int i=0;i< c.length ; i++ ){
			if( Character.isLowerCase(c[i])){
				c[i] = Character.toUpperCase(c[i]);
			} else {
				c[i] = Character.toLowerCase(c[i]);
			}
		}
		String s ="";
		for(int i = 0; i < c.length ; i++ ){
			s += String.valueOf(c[i]);
		}
		System.out.println(s);
	}
}
