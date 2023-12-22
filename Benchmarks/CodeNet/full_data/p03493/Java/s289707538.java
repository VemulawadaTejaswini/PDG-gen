import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());	}

	public static void main(String[] $){
		System.out.println(s.next().replaceAll("0","").length());
	}
}