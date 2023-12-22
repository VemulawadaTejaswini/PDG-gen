import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

    	String[] line1 = parameter.nextLine().split(" ");
        String[] line2 = parameter.nextLine().split(" ");

        int[] intNumber = new int[line2.length];
        int maxNumber = 0;

        for (int i = 0; i < line2.length; i++) {

        	intNumber[i] = Integer.parseInt(line2[i]);

        	if (maxNumber < intNumber[i]) {

        		maxNumber = intNumber[i];
        	}
        }

        double sumNumber = 0;

        for (int nowNumber : intNumber) {

        	sumNumber = sumNumber + maxNumber/ nowNumber;
        }

        double lastNumber = maxNumber / sumNumber;

        System.out.println(lastNumber);
    }
}
