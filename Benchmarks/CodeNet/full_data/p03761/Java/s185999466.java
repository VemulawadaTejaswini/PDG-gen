import java.util.Arrays;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		Character c[][]=new Character[n][51];
		for(int i=0;i<n;i++) {
			String s=scanner.next();
			for(int j=0;j<51;j++) {
				if(j<s.length()) {
					c[i][j]=s.charAt(j);
				}else {
					c[i][j]='Z';
				}
			}
			Arrays.sort(c[i]);
		}
		Character[] tmp=c[0];
		for(int i=1;i<n;i++) {
			tmp=calc(tmp,c[i]);
		}
		for(int i=0;i<51;i++) {
			if(Character.isLowerCase(tmp[i]))
				System.out.print(tmp[i]);
		}
		System.out.println("");
	}

	private static Character[] calc(Character[] tmp, Character[] c) {
		Character[] res=new Character[51];
		Arrays.fill(res, 'Z');
		int a=0;
		for(int i=0;i<51;i++) {
			char c1=tmp[i];
			for(int j=a;j<51;j++) {
				char c2=c[j];
				if(c1==c2) {
					res[i]=c1;
					a++;
					break;
				}
			}
		}
		Arrays.sort(res);
		return res;
	}
}