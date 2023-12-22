import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long output = sc.nextLong();
		long f = (long)0;
		for(long i = 1;i<=output;i++)
		{
			if(i%3!=0&&i%5!=0)f+=i;
		}
		System.out.println(f);

	}
}