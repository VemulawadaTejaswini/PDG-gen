import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.next().split("");
		int slen = S.length;
		String[] key = {"k","e","y","e","n","c","e"};
		int keylen = key.length;
		sc.close();
		for(int i=0,j=0;i<slen&&j<keylen;i++) {
			if(S[i].equals(key[j])) {
				j++;
				if(j>=keylen) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}

}
