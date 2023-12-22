import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int direction = 1, top=500000, length=0;
		String s = sc.next();
		char[] string = new char[1000000];
		length = s.length();
		char[] temp = s.toCharArray();
		for(int i=0;i<length;i++) string[top+i] = temp[i];
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			int t = sc.nextInt();
			if(t==1) {
				if(direction==1) direction=2;
				else direction=1;
			}else if(t==2) {
				int f = sc.nextInt();
				char c = sc.next().toCharArray()[0];
				length++;
				if((f==1 && direction==1) || (f==2 && direction==2)) {
						top--;
						string[top]=c;
				}else string[top+length]=c;
 			}
		}
		if(direction==1) {
			for(int i=top;i<top+length;i++) System.out.print(string[i]);
		}else {
			for(int i=top+length-1;i>=top;i--) System.out.print(string[i]);
		}
		System.out.println();
	}
}