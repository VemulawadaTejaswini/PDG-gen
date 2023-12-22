import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[m];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Cards cards = new Cards(a);
		for(int i = 0; i < m; i++){
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		cards.operate(b, c);
		cards.printAns();
		
	}
}
class Cards{
	int[] a;
	Command[] commands;
//	int[] operate;
	Cards(int[] a){
		this.a = a;
		Arrays.sort(a);
//		operate = new int[a.length];
	}
	void operate(int[] b, int[] c){
		int m = b.length;
		commands = new Command[m];
		for(int i = 0; i < m; i++){
			commands[i] = new Command(b[i], c[i]);
		}
		Arrays.sort(commands, (com1, com2) -> com2.val - com1.val);
		int aIndex = 0;
		loop:
		for(int i = 0; i < commands.length; i++){
			int value = commands[i].val;
			int nextNum = commands[i].num + aIndex;
			if(a.length < nextNum) {
				nextNum = a.length;
			}
			for(; aIndex < nextNum; aIndex++){
				if(a[aIndex] < value){
					a[aIndex] = value;
				}else{
					break loop;
				}
			}
		}
	}
	void printAns(){
		long ans = 0;
		for(int i = 0; i < a.length; i++){
			ans += a[i];
		}
		System.out.println(ans);
	}
}
class Command {
	int num;
	int val;
	Command(int b, int c){
		this.num = b;
		this.val = c;
	}
}
