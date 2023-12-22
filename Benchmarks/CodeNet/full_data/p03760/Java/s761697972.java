import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String	O = sc.next(),E=sc.next();
		char[] array = new char[E.length()+O.length()+1];
		int count=0;
		char[] z = new char[1];

		for(int i=1;i<E.length()*2;i+=2) {
			array[i] = E.charAt(count);
			count++;
		}
		count=0;
		for(int i=0;i<O.length()*2;i+=2) {
			array[i] = O.charAt(count);
			count++;
		}
		for(int i=0;i<array.length;i++) {
			if(array[i] != z[0])System.out.print(String.valueOf(array[i]));
		}
	}

	public static int sample() {
		return 1;
	}

}
