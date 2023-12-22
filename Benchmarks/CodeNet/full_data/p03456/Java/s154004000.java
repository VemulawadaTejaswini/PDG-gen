import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] st = sc.nextLine().split(" ");
    	String mregedNumber = st[0] + st[1];
    	double heihou = Math.sqrt(Double.parseDouble(mregedNumber));
    	int intHeiohou = (int) heihou;
    	double compHeihou = (double) intHeiohou;
    	
    	String result = "";
    	if(heihou == compHeihou) {
    		result = "Yes";
    	}else {
    		result = "No";
    	}
    	System.out.println(result);
    	
    	
    	
    }
}