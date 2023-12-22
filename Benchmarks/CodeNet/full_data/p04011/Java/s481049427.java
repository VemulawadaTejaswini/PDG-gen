import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
       		String[] strStdIn = new String[4];
		while (scanner.hasNextLine()) {
			int i = 0;
			strStdIn[i] = scanner.nextLine();
			i++;

			if (s.length() == 0) {
				break;
		}

		int totalLiving = Integer.parseInt(strStdIn[0]);
		int initialLiving = Integer.parseInt(strStdIn[1]);
		int initialCost = Integer.parseInt(strStdIn[2]);
		int latterCost = Integer.parseInt(strStdIn[3]);
		
		int initialLivingDate = totalLiving - initialLiving + 1;
		int latterLivingDate = totalLiving - initialLivingDate -1;

		int totalCost = initialCost * initialLivingDate + latterCost * latterLivingDate;

		String returnString = Integer.toString(totalCost);

        	System.out.println(totalCost);
    }
}