
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		atcode();
	}

	public static void atcode() {
		Scanner sc=new Scanner(System.in);
		String[] nx=sc.nextLine().split(" ");
		Integer n=Integer.valueOf(nx[0]);
		Integer x=Integer.valueOf(nx[1]);
		Integer min=1000;
		Integer count=0;
		for(int i=0;i<n;i++) {
			Integer m=Integer.valueOf(sc.nextLine());
			min=m.compareTo(min)<0?m:min;
			x-=m;
			count++;
		}
		count+=x/min;
		System.out.println(count);
	}
}
