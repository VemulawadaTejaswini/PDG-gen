import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		String str = reader.next();
		String[] arr = str.split("");
		String ans = "-1";
		String[] answers = new String[4];
		answers[0] = "SW";
		answers[1] = "WS";
		answers[2] = "SS";
		answers[3] = "WW";
		for (int k = 0; k < 4; k++) {
			for (int i = 2; i < N; i++) {
				char sw = ' ';
				char pre_a = arr[i-1].charAt(0);
				char pre_sw = answers[k].charAt(i-1);
				char pre_pre_sw = answers[k].charAt(i-2);
				boolean same = isSame(pre_pre_sw, pre_sw, sw, pre_a);
				boolean dif = isDif(pre_pre_sw, pre_sw, sw, pre_a);
				if (same) {
					sw = pre_pre_sw;
				} else if (dif && pre_pre_sw == 'W') {
					sw = 'S';
				} else if (dif && pre_pre_sw == 'S') {
					sw = 'W';
				} else {
					answers[k] = "";
					break;
				}
				answers[k] += sw;
				if (!(isSame(pre_pre_sw, pre_sw, sw, pre_a) || isDif(pre_pre_sw, pre_sw, sw, pre_a))) {
					answers[k] = "";
					break;
				}
			}
		}
		for (int k = 0; k < 4 ;k++) {
			if (answers[k].length() > 0) {
				char sw = answers[k].charAt(0);
				char pre_a = arr[N-1].charAt(0);
				char pre_sw = answers[k].charAt(N-1);
				char pre_pre_sw = answers[k].charAt(N-2);
				boolean same = isSame(pre_pre_sw, pre_sw, sw, pre_a);
				boolean dif = isDif(pre_pre_sw, pre_sw, sw, pre_a);
				boolean isValid = same || dif;
				if (isValid) {
					ans = answers[k];
					break;
				}
			}
		}
		System.out.println(ans);
		reader.close();

	}
	public static boolean isSame(char first_sw, char second_sw, char third_sw,
							char second_ox) {
		return ((second_sw == 'S' && second_ox == 'o') ||
				(second_sw == 'W' && second_ox == 'x')) && (first_sw == third_sw || third_sw == ' ');

	}

	public static boolean isDif(char first_sw, char second_sw, char third_sw,
				char second_ox) {
		return ((second_sw == 'S' && second_ox == 'x') ||
		(second_sw == 'W' && second_ox == 'o')) && (first_sw != third_sw || third_sw == ' ');
	}


}



