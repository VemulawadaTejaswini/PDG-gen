public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int list [] = new int [3];
		String str = sc.nextLine(); 
		String[] strLine = str.split(" ");
		int a = Integer.parseInt(strLine[0]);
		int b = Integer.parseInt(strLine[1]);
		int c = Integer.parseInt(strLine[2]);
		Arrays.sort(strLine);
		System.out.println(strLine[0] + " " + strLine[1] + " " +strLine[2]);
	}
}
