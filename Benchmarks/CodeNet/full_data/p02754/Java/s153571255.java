import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		long n = Long.parseLong(as.next());
		long a = Long.parseLong(as.next());
		long b = Long.parseLong(as.next());
		if(n%(a+b)<=a){
			System.out.println(n/(a+b)*a+n%(a+b));
		}else{
			System.out.println(n/(a+b)*a+a);
		}
	}
}