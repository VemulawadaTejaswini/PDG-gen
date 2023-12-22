import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Integer n = null;
	String a = null;
	String b = null;
	String c = null;
	boolean err = false;
    Scanner scan = new Scanner(System.in);

	try {
		n = Integer.parseInt(scan.nextLine());
		a = scan.nextLine();
		b = scan.nextLine();
		c = scan.nextLine();
	}
	catch (Exception e) {
		System.out.println("不正な入力が含まれています。");
		err = true;
	}

	if (n != a.length() || n != b.length() || n != c.length()) {
		System.out.println("入力が不正です。");
		err = true;
	}

	if (err == false) {
		// 3つの配列の比較
		int max = n * 2;
		String[] arrayA = a.split("");
		String[] arrayB = b.split("");
		String[] arrayC = c.split("");

		for(int i = 0; i < n; i++) {
			if (arrayA[i].equals(arrayB[i]) && arrayA[i].equals(arrayC[i])) {
				max = max - 2;
			}
			else if (arrayA[i].equals(arrayB[i])){
				max = max - 1;
			}
			else if (arrayA[i].equals(arrayC[i])){
				max = max - 1;
			}
			else if(arrayB[i].equals(arrayC[i])){
				max = max - 1;
			}
		}

		System.out.println(max);

	}

	}
}
