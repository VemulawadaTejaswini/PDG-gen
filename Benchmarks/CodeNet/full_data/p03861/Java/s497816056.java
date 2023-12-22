import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
	sc = new Scanner(System.in);
	Long a = sc.nextLong();
	Long b = sc.nextLong();
	Long x = sc.nextLong();
	int count=0 ;
	for(int i=0;a<=b;i++){
		a=a+i;
		if(a%x==0)count++;
	}
	if(b%x==0)count++;
	if(a==0)count++;
	if(a==b)count=0;
	System.out.println(count);
	
}
}
