import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int num = a.length();
		String c[] = new String[num];
		String d[] = new String[num];

		for(int i=0;i<num;i++) {
			c[i] = a.substring(i, i+1);
			d[i] = b.substring(i, i+1);
		}

		int judge = 0;
		int t = 0;

		for(int i=0;i<num;i++) {
			judge = 1;
			for(int j=0;j<num;j++) {
				t = (j + i)%num;
				if(!c[j].equals(d[t])) {
					judge = 0;
					break;
				}
			}
			if(judge == 1) {
				break;
			}

		}

		if(judge == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}