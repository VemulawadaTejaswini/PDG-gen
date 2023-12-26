public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int L[] = new int[N];
		for(int i = 0; i < N ; i++) {
			L[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int answer = 1;
		int D = 0;
		for(int i = 0; i < N ; i++) {
			D = D + L[i];
			if(D <= X) {
				answer += 1;
			}else {
				break;
			}
		}
		System.out.print(answer);
	}
}
