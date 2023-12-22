import java.util.Scanner;

public class Main {

	public static char[] assign;
	public static char[] ans;
	public static int n;

	public static boolean check() {
		for(int i = 0; i < n; i++) {
			int next = (i + 1) % n;
			int back = (i + n - 1) % n;

			if(assign[i] == 'o' && ans[i] == 'S') {
				if(ans[back] == 'S' && ans[next] == 'W') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'S') {
					return false;
				}
			}
			else if(assign[i] == 'o' && ans[i] == 'W') {
				if(ans[back] == 'S' && ans[next] == 'S') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'W') {
					return false;
				}
			}
			else if(assign[i] == 'x' && ans[i] == 'S') {
				if(ans[back] == 'S' && ans[next] == 'S') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'W') {
					return false;
				}
			}
			else if(assign[i] == 'x' && ans[i] == 'W') {
				if(ans[back] == 'S' && ans[next] == 'W') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'S') {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		assign = sc.next().toCharArray();
		ans = new char[n];

		for(int cnt = 0; cnt < 2; cnt++) {
			for(int i = 0; i < n; i++) {
				ans[i] = '0';
			}

			if(cnt == 0) {
				ans[0] = 'S';
			}
			else if(cnt == 1) {
				ans[0] = 'W';
			}

			for (int i = 0; i < n; i++) {

				int next = (i + 1) % n;
				int back = (i + n - 1) % n;

				if(assign[i] == 'o') {
					if(ans[i] == 'S') {
						if(ans[back] == 'S') {
							ans[next] = 'S';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'W';
						}
						else if(ans[back] == '0') {
							ans[back] = 'S';
							ans[next] = 'S';
						}
					}
					else if(ans[i] == 'W') {
						if(ans[back] == 'S') {
							ans[next] = 'W';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'S';
						}
						else if(ans[back] == '0') {
							ans[back] = 'W';
							ans[next] = 'S';
						}
					}
				}
				else if(assign[i] == 'x') {
					if(ans[i] == 'S') {
						if(ans[back] == 'S') {
							ans[next] = 'W';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'S';
						}
						else if(ans[back] == '0') {
							ans[back] = 'W';
							ans[next] = 'S';
						}
					}
					else if(ans[i] == 'W') {
						if(ans[back] == 'S') {
							ans[next] = 'S';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'W';
						}
						else if(ans[back] == '0') {
							ans[back] = 'S';
							ans[next] = 'S';
						}
					}
				}
			}

			if(check()) {
				String str = String.valueOf(ans);
				System.out.println(str);
				return;
			}
		}
		System.out.println(-1);
	}
}
