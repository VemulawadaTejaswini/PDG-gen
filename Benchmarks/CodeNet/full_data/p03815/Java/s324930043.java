import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long count = (x/11)*2;
		if((x%11)==0){System.out.println(count);}
		else if((x%11)<=6){count++; System.out.println(count);}
			else{count+=2; System.out.println(count);}
	}
}