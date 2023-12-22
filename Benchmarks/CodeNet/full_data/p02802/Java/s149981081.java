import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			int[]p =new int[M];
			String[]S = new String[M];
			for(int i = 0;i<M;i++) {
				p[i] = scan.nextInt();
				S[i] = scan.next();
			}
			
			long seitou = 0;
			long pena = 0;
			String[]res = new String[N];
			
			for(int i = 0;i<M;i++) {
				if(res[p[i]-1]==null) {//まだ一回も回答されてない
					if(S[i].equals("WA")) {
						res[p[i]-1] = "WA";
						pena++;
					}else {
						res[p[i]-1] = "AC";
						seitou++;
					}
				}else{//一回回答した問題。ACなら無視
					if(res[p[i]-1].equals("WA")) {
						if(S[i].equals("WA")) {
							pena++;
						}else{
							res[p[i]-1] = "AC";
							seitou++;
						}
					}
				}
			}
			
			System.out.println(seitou);
			System.out.println(pena);
			
			
			
			
			
		}
	}
}
