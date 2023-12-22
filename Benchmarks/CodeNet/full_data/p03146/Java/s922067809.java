import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// get a integer
		int num = sc.nextInt();
		
		int result = getResult(num);
		System.out.println(result);
	}
	
	public static boolean isMaxNum(int num) {
		return num > 100 ? true : false;
	}
	
	public static boolean isOddNumber(int num) {
		return (num % 2) != 0 ? true : false;
	}
	
	public static int getInteger(int num) {
		if(isOddNumber(num)) {
			return (3 * num) + 1;
		}
		
		return num / 2;
	}
	
	public static int getResult(int num) {
		if(isMaxNum(num)) {
			return 0;
		}
		
		String[] temp = new String[1000000];
		
		//boolean notFound = true;
		int index = 1;
		while(true) {
			if(temp[num] != null) {
				break;	
			}
			temp[num] = "inserted";
			num = getInteger(num);
			
			index++;
		}
		return index;
	}
	
}
