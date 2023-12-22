import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] line = sc.nextLine().split(" ");
    	int intA = Integer.parseInt(line[0]);
    	int intB = Integer.parseInt(line[1]);
    	int intC = Integer.parseInt(line[2]);
    	int tmp1 = intA - intB;
    	int tmp2 = intC - tmp1;
    	int result = 0;
    	if(tmp2 < 0) {
    		result = 0;
    	}else {
    		result = tmp2;
    	}
    	

    	System.out.println(result);
    	
	}
}