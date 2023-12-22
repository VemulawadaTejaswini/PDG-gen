import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Integer input = Integer.parseInt(scan.nextLine());
 
        if(input == 1) {
        	System.out.println(1);
        } else {
        	int passKindCount = passKindCountCalc(input);
        	System.out.println(passKindCount);
        }
        scan.close();
	}
	
	private static int passKindCountCalc(int passKind) {
		
		for(int i=0; i < 3; i++) {
			passKind *= passKind;
		}
		return passKind;
		
	}

}