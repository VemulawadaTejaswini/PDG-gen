import java.util.Scanner;//入力を取得する(Scanner)

class Main {
				public static void main(String arts[]) {
								int N,K;
								Scanner sc = new Scanner(System.in);
								N = sc.nextInt();
								K = sc.nextInt();

								int ans = 0;

								for(int i = 0 ; i < N ; i++){
											int h;
											h = sc.nextInt();
											if(h>=K) ans++;
								}
								System.out.println(ans);

				}
}
