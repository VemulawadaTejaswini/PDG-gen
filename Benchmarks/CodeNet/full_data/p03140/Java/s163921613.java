public class Main {

	public static void main(String[] args) {

	Integer n = null;
	String a = null;
	String b = null;
	String c = null;
	boolean err = false;

	if (args.length != 4) {
		System.out.println("入力が不正です。");
		err = true;
	}
	try {
		n = Integer.parseInt(args[0]);
		a = args[1];
		b = args[2];
		c = args[3];
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
