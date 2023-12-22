import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] inputNumber = sc.nextLine().split(" ");
    	int tap = Integer.parseInt(inputNumber[0]);
    	int neededTap = Integer.parseInt(inputNumber[1]);
    	
    	int result = 0;
    	
    	for(int i = 1;i<=20;i++) {
    		if(tap*i>=neededTap) {
    			result = i;
    			break;
    		}
    	}
    	System.out.println(result);
    }
}