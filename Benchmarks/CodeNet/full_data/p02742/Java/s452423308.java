package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long height = sca.nextLong();  // 縦
	long width = sca.nextLong();   // 横

	long ans = 0L;
	if(width % 2 == 0) {
		ans = width/2 * height;
	}
	else {
		if(height % 2 == 0) {
			ans = (width/2 * height) + height / 2;
		}
		else {
			ans = (width/2 * height) + height / 2 + 1;
		}
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}