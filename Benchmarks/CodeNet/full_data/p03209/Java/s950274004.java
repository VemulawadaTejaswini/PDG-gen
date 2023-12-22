import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		String hamburger ="BPPPB";
		for (int i=1;i<N;i++) {
			hamburger = "B" + hamburger + "P" + hamburger + "B";
		}


		System.out.println(hamburger);
		long L = hamburger.length();
		hamburger = hamburger.substring((int)(L-X));
		System.out.println(hamburger);
		System.out.println(hamburger);


		String ham[] = hamburger.split("");

		int cnt = 0;
		for(int i=0;i<ham.length;i++) {
			if (ham[i].equals("P")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}