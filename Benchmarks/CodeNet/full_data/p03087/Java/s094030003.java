import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		String[] questionArray = new String[n];
		for(int i = 0;i < q;i++) {
			questionArray[i]= s.substring(sc.nextInt()-1,sc.nextInt());
		}

		for(int i = 0;i < q;i++) {
			System.out.println(getAcCount(questionArray[i]));
		}


	}

	private static int getAcCount(String input) {
		String[] inputArray = input.split("");
		int acCount = 0;
		for(int i=0;i < inputArray.length;i++) {
			if(!inputArray[i].equals("A")) {
				continue;
			}else {
				if(i == inputArray.length-1) {
					break;
				}
				if(inputArray[i+1].equals("C")) {
					acCount++;
					i++;
				}
			}
		}

		return acCount;
	}

}