import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=sc.nextInt();
	int d_2=d*2+1;
	if(n%d_2!=0) {
		System.out.println((n/d_2)+1);
	}else {
		System.out.println(n/d_2);
	}
}
}