import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		System.out.println(IntStream.range(0,gInt()).map(i->gInt()+gInt()).min().getAsInt());
	}
}