public class Main {
 	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		String S = scanner.next();
 		String[] splitArray = S.split("");
 		int sum = 0;
 		for (int j = 0; j < splitArray.length / 2; j++) {
 			if (splitArray[2*j].equals("L")) {
 				sum += 1;
 			}
 			if (splitArray[2*j + 1].equals("R")) {
 				sum += 1;
 			}
 		}
 		if (splitArray.length % 2 == 1) {
 			if (splitArray[splitArray.length - 1].equals("L")) {
 				sum += 1;
 			}
 		}
 		if (sum != 0) {
 			System.out.println ("No");
 		} else {
 			System.out.println ("Yes");
 		}
 	}
 }
