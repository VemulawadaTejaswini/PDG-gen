import java.util.*;

class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int a= in.nextInt()*10;
		int b= in.nextInt();
		if((a+b)%4==0){
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
		//in.close();
	}
}
