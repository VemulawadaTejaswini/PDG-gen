import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int min;
		int foo;
		String s;
		final String _W="W";
		final String _E = "E";
		final String _NONE = "";
		final int _NUM1 = 1;
		final int _NUM0 = 0;
		n = sc.nextInt();
		s = sc.next();

		int end = n-_NUM1;

		min = s.substring(_NUM1,n).replaceAll(_W, _NONE).length();

		for(int i = _NUM1; i < end; i++){
			foo =  s.substring(_NUM0,i).replaceAll(_E, _NONE).length();
			if(min >= foo){
			foo += s.substring(i+_NUM1,n).replaceAll(_W, _NONE).length();
			min = Math.min(min, foo);
			}
		}

		foo = s.substring(_NUM0,n).replaceAll(_W, _NONE).length();
		min = Math.min(min, foo);

		if(min != 300000)
		System.out.println(min);
		else
		System.out.println(_NUM0);
	}
}
