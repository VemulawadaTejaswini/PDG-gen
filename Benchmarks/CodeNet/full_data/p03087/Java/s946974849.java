import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] acArray = getAcCount(s,n);
		for(int i = 0;i < q; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(acArray[end]-acArray[start]);
		}
	}

	private static int[] getAcCount(String input,int n) {
		int[] acArray = new int[n +1];
		String[] inputArray = input.split("");
		int acCount = 0;
		for(int i=0;i < inputArray.length;i++) {
			if(!inputArray[i].equals("A")) {
				acArray[i+1] = acCount;
				continue;
			}else {
				if(i == inputArray.length-1) {
					acArray[i+1] = acCount;
					break;
				}
				if(inputArray[i+1].equals("C")) {
					acArray[i+1] = acCount;
					acCount++;
					acArray[i+2] = acCount;
				}else {
					acArray[i+1] = acCount;
				}
			}
		}

		return acArray;
	}

}