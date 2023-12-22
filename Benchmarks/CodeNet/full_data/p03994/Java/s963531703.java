
public class Main {
	// aにできるまで最初からステップ，あとは最後のものを最後まで回す
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(br.readLine());
		int num = Integer.valueOf(br.readLine());
		br.close();
		int index = 0;
		int length = str.length();

		while (index < length - 1) {
//			if(num>26*length){
//				str = str.replaceAll("[a-z]", "a");
//				break;
//			}
			if (num > counttoa(str.charAt(index))) {
				num = num - counttoa(str.charAt(index));
//				str = str.substring(0, index) + "a" + str.substring(index + 1);
				str.setCharAt(index, 'a');
			}
			index++;
		}

		// 最後の文字を変換
//		str = str.substring(0, length - 1) + stepChr(str.charAt(length - 1), num);
		str.setCharAt(length-1, stepChr(str.charAt(length-1),num));
		System.out.println(str);

	}

	private static char stepChr(char input, int num) {
		int realNum = num % 26;
		char result = input;
		for (int i = 0; i < realNum; i++) {
			result = nextChr(result);
		}
		return result;
	}

	private static char nextChr(char input) {
		if (input == 'z') {
			return 'a';
		} else
			return (char) ((int) input + 1);

	}

	private static int counttoa(char input) {
		if (input == 'a') {
			return 0;
		}
		return 26 - ((int) input - (int) 'a');
	}

}
