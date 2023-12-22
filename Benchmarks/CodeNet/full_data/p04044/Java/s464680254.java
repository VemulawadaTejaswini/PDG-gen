import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		String in[]=new String[s.nextInt()];
		s.next();
		for(int i=0;i<in.length;i++) in[i]=s.next();
		System.out.println(Arrays.stream(in).sorted().collect(Collectors.joining()));
	}
}