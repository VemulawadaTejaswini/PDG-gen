import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		String kirai[] = new String[k];
		for (int i = 0; i < k; i++) {
			kirai[i] = sc.next();
		}

		String number[];
		number = String.valueOf(n).split("");
		String anser = "";
		String keta = "";
		for (int j = number.length - 1; j >= 0; j--) {
			for (int h = 0; h < kirai.length; h++) {
				if (kirai[h].equals(number[j])) {
					int n2 = (Integer.parseInt(number[j]) + 1) % 10;// これだと小さい数ができない
					number[j] = String.valueOf(n2);
					if (n2 == 0) {
						h = 0;
						if (j == 0)
							if(!keta.equals("")){
								n2 = Integer.parseInt(keta)+1;
								keta = String.valueOf(n2);
							}else keta = "1";
						else {
							int n3 = (Integer.parseInt(number[j - 1]) + 1) % 10;
							number[j - 1] = String.valueOf(n3);
							for (int i = j - 1; i >= 0; i--) {
								if (number[i].equals("0")) {
									if (i == 0)
										if(!keta.equals("")){
											n2 = Integer.parseInt(keta)+1;
											keta = String.valueOf(n2);
										}else keta = "1";
									else {
										n3 = (Integer.parseInt(number[i-1]) + 1) % 10;
										number[i-1] = String.valueOf(n3);
									}
								} else break;
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < number.length; i++) {
			anser += number[i];
		}
		if (!keta.equals("")) {
			for(int i = 0;i < kirai.length;i++){
				if(keta.equals(kirai[i])){
					int n4 = Integer.parseInt(keta)+1;
					keta = String.valueOf(n4);
				}
			}
			keta += anser;
			System.out.println(keta);
		} else
			System.out.println(anser);
	}
}