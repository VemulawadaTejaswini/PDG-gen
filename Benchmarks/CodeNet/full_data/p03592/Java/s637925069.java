import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			//int N = Integer.parseInt(str);
			//StringBuilder sb = new StringBuilder();
			String[] s = str.split(" ",0);
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			int K = Integer.parseInt(s[2]);
			int re = 0;
			for(int i = 0;i< N+1;i++) {
				if(re == 1) break;
				for(int j = 0;j<M+1;j++) {
					if(i == 0 || j == 0) {
						if(i*M+j*N== K) {
							System.out.println("Yes");
							re++;
							break;
						}
					}else if(i*M+j*N-2*(i*j) == K){
						System.out.println("Yes");
						re++;
						break;
					}
					if(i==N-1 && j==M-1){
						System.out.println("No");
					}
				}
			}
//			String str = br.readLine();
//			if(str.length()< 4) {
//				System.out.println("No");
//			}else if(str.substring(0, 4).equals("YAKI")) {
//				System.out.println("Yes");
//			}else {
//				System.out.println("No");
//			}
//			System.out.println(sb);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
