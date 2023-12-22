import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		while(f%g == 0){
			f=f+1;
			count = count + 1;
		}
		while(d%e == 0){
			d=d+1;
			count = count + 1;
		}
		while(b%c == 0){
			b=b+1;
			count = count +1;
		}
		System.out.println(count);
	}
}