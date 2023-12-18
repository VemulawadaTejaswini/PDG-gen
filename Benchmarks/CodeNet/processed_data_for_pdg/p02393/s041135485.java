public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";
		String[] sdata = input.split(" ");
		int[] idata = new int[3];
		boolean condition = true; 
		int temp = 0; 
		int number = 0; 
		for (int i = 0; i < sdata.length; i++) {
			idata[i] = Integer.parseInt(sdata[i]);
			if (idata[i] <= 0 || idata[i] > 10000) {
				condition = false;
				break;
			}
		}
		if (condition) {
			for (int i = 0; i < 3 - 1; i++) {
				temp = idata[i];
				number = i;
				for (int j = i + 1; j < 3; j++) {
					if (idata[j] < temp) {
						temp = idata[j];
						number = j;
					}
				}
				idata[number] = idata[i];
				idata[i] = temp;
			}
			output += "" + idata[0];
			for (int i = 1; i < 3; i++) {
				output += " " + idata[i];
			}
			System.out.println(output);
		}
	}
}
