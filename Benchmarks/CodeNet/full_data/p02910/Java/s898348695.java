import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] steps = line.toCharArray();

        String result = "Yes";
        for (int i = 0; i < steps.length; i++) {
        	if (i%2==0 && steps[i] =='L') {
        		result = "No";
        		break;
        	} else if (i%2==1 && steps[i] == 'R') {
        		result = "No";
        		break;
        	}
        }
        System.out.println(result);
    }





}