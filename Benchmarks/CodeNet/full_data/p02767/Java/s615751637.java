import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	int N =sc.nextInt();
	int x[]=new int[N];
	for(int i=0;i<N;i++) {
		x[i]=sc.nextInt();
	}
	int least=0;
	int hp;
	for(int p=1;p<=100;p++) {
		hp=0;
		for(int a=0;a<N;a++) {
			hp+=(x[a]-p)*(x[a]-p);
		}
		if(p==1) {
			least=hp;
		}else if(least>hp) {
		least=hp;
		}
	}
	p(least);
	}
}