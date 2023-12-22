public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		char[] data = sc.nextLine().toCharArray();
		for (int i=0; i < data.length; i++) {
			if ( Character.isUpperCase(data[i]) ) {
				data[i] = Character.toLowerCase(data[i]);
			} else if ( Character.isLowerCase(data[i]) ) {
				data[i] = Character.toUpperCase(data[i]);
			}
		}
		System.out.println(data);
	}
}
