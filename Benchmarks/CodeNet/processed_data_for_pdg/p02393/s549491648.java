public class Main {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int[] intArr = new int[3];
	intArr[0] = a;
	intArr[1] = b;
	intArr[2] = c;
	Arrays.sort(intArr);
	System.out.println("" + intArr[0] + " " + intArr[1]
	+ " " + intArr[2]);
}
}
