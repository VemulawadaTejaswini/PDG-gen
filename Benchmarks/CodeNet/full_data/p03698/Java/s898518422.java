import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int l) {
		return IntStream.range(0,l);
	}
	public static void main(String[]__){
		int[]m=new int[26];
		for(char c:s.next().toCharArray())
			m[c-'a']++;
		System.out.println(
				Arrays.stream(m).anyMatch(i->i>1)
				?"no":"yes"
				);
	}
}
