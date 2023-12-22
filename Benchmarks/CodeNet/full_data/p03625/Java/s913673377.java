import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int count = Integer.parseInt(in);
		String inLine = sc.nextLine();
		String[] inArray = inLine.split(" ");
		int[] intArray1 = new int[count];
		int[] intArray2 = new int[count];
		int[] intArray3 = new int[count];
		for (int i = 0; i < count; i++) {
			intArray1[i] = Integer.parseInt(inArray[i]);
		}
		intArray2 = intArray1.clone();
		int index = 0;
		for (int i = 0 ; i < count; i++) {
			for (int j = 0; j < count;j++) {
				boolean hit = false;
				if (intArray1[i] == intArray2[j] && i != j) {
					for (int k = 0;k < count;k++) {
						if (intArray2[j] == intArray3[k]) {
							hit = true;
						}
					}
					if (!hit) {
						intArray3[index] = intArray2[j];
						index++;
					}
				}
				hit = false;
			}
		}
		int n1 = 0;
		int n2 = 0;
		for (int i = 0 ; i < count; i++ ) {
			if (intArray3[i] != 0  ) {
				if (n1 == 0) {
					n1 = intArray3[i];
				} else if (n1 < intArray3[i] && n2 == 0){
					n2 = intArray3[i];
				} else if (n1 < intArray3[i] && n2 != 0){
					n1 = n2;
					n2 = intArray3[i];
				}
			}
		}
		if (n1 != 0 && n2 != 0) {
			System.out.println(n1 * n2);
		} else if (n1 != 0 && n2 == 0) {
			System.out.println(n1 * n1);
		} else if (n1 == 0 && n2 != 0){
			System.out.println(n2 * n2);
		} else {
			System.out.println(0);

		}

	}


}