import java.util.Scanner;
public class Main {
	static int N;
	static int count;
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	count("","3");
	count("","5");
	count("","7");
	System.out.println(count);
}

public static void count(String s,String s2) {
	s+=s2;
	if(Long.parseLong(s)>N) {
		return;
	}
	if(s.contains("3")&&s.contains("5")&&s.contains("7")) {
	count++;
	}
	count(s,"3");
	count(s,"5");
	count(s,"7");
}
}
