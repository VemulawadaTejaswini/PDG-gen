import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	long x=sc.nextLong();
	long y=sc.nextLong();
	long now=x;
	for(long i=1;i<=y;i++){
		if(y<now){
			System.out.println(i-1);
			break;
		}
		now=now*2;
	}

	}}