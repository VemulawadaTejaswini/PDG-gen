import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long h = sca.nextLong();
	long w = sca.nextLong();

	long ans = 0L;

	if(h == 1) {
		ans = 1;
	}
	else if(w == 1) {
		ans = 1;
	}
	else if(h % 2 == 0 && w % 2 == 0) {
		ans = (w / 2) * h;
	}
	else if(h % 2 == 0 && w % 2 == 1) {
		ans = (h / 2) * (w / 2) + (h / 2) * (w / 2 + 1);
	}
	else if(h % 2 == 1 && w % 2 == 0) {
		ans = (w / 2) * h;
	}
	else {
		ans = (h / 2) * (w / 2) + (h / 2 + 1) * (w / 2 + 1);
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}