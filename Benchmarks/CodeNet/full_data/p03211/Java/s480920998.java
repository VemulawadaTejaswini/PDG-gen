import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.next();
		int minDiff = Integer.MAX_VALUE;
        for (int i=0; i<n-2; i++) {
        	int threeDigitNum = Integer.parseInt(str.substring(i, i+3));
            int diff = Math.abs(753 - threeDigitNum);
            minDiff = Math.min(diff, minDiff);
        }
        System.out.println(minDiff);
    }
}