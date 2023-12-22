import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = l / 3;
		int b = (l - a) / 2;
		int c = l - a - b;
		double vol = a * b * c;
		System.out.println(vol);
	}
	
	}