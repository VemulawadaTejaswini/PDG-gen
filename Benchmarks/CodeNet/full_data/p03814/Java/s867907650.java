import java.util.Scanner;
public class Main{
	String s;

	public Main(String str){
		s = str;
	}
	public int searchA(){
		return s.indexOf("A");
	}
	public int searchZ(){
		return s.lastIndexOf("Z") + 1;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Main m = new Main(str);
		int start = m.searchA();
		int end = m.searchZ();
		System.out.println(end - start);

	}
}

