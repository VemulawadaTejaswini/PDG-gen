import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int a=0;
	int sa=0;
	for(int i=0;i<N;i++) {
		a=sc.nextInt();
		sa=i;
	}
	if(a==0) {
		System.out.println(0);
	}else {
		System.out.println(1);
		System.out.println(sa+1);
	}
}
}
