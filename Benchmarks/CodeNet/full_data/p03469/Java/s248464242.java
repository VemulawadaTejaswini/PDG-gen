import java.util.*;

class Main {
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		StringBuilder insert = new StringBuilder("2018");

		String str = sc.next();

		StringBuilder sb = new StringBuilder(str);

		sb.delete(0, 4);

		insert.append(sb.toString());

		System.out.println(insert.toString());

	}
}
